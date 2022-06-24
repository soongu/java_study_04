package datastructure.chap10.binarytree;

class Node {
    private int data; // 트리에 저장할 데이터
    private Node leftChild;  // 왼쪽 자식
    private Node rightChild; // 오른쪽 자식

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return String.format("[ %d ]", data);
    }
}

public class BinaryTree {

    private Node root; // 트리의 루트 노드


    //============= 삽입 ==============//
    public void add(int data) {
        // 삽입할 데이터 노드 생성
        Node newNode = new Node(data);

        // 빈 트리면 새로운 노드를 루트로 지정
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;

                // 삽입할 데이터가 타겟노드의 데이터보다 작은 경우
                if (data < current.getData()) {
                    current = current.getLeftChild();
                    if (current == null) {
                        parent.setLeftChild(newNode);
                        return;
                    }
                } else { // 큰 경우
                    current = current.getRightChild();
                    if (current == null) {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }


    //============= 순회 =============//

    // 전위 순회 (pre order) - 중전후
    public void preOrder(Node tempRoot) {
        if (tempRoot != null) {
            System.out.printf("%d ", tempRoot.getData());
            preOrder(tempRoot.getLeftChild());
            preOrder(tempRoot.getRightChild());
        }
    }

    // 중위 순회 (in order) - 전중후
    public void inOrder(Node tempRoot) {
        if (tempRoot != null) {
            inOrder(tempRoot.getLeftChild());
            System.out.printf("%d ", tempRoot.getData());
            inOrder(tempRoot.getRightChild());
        }
    }

    // 후위 순회 (post order) - 전후중
    public void postOrder(Node tempRoot) {
        if (tempRoot != null) {
            postOrder(tempRoot.getLeftChild());
            postOrder(tempRoot.getRightChild());
            System.out.printf("%d ", tempRoot.getData());
        }
    }


    //===================== 탐색 ===================//

    public Node find(int targetData) {

        Node current = root;

        while (true) {
            if (current == null) return null; // 탐색 실패

            // 찾는 값이 현재 노드의 값보다 작은 경우
            if (targetData < current.getData()) {
                current = current.getLeftChild();
            } else if (targetData > current.getData()) {
                current = current.getRightChild();
            } else {
                return current; // 탐색 성공
            }
        }

    }

    //============ 최대, 최소값 탐색 =================//
    public Node findMin() {
        if (isEmpty()) return null; // 탐색 실패

        Node current = root;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }
    public Node findMax() {
        if (isEmpty()) return null; // 탐색 실패

        Node current = root;
        while (current.getRightChild() != null) {
            current = current.getRightChild();
        }
        return current;
    }

    //================== 삭제 =================//
    public boolean delete(int targetData) {
        // 삭제 노드와 해당 삭제노드의 부모노드를 탐색
        Node current = root;
        Node parent = current;

        while (targetData != current.getData()) {
            if (current == null) return false;

            parent = current;
            if (targetData < current.getData()) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }

        // 삭제 진행
        // 삭제 대상노드의 자식이 없는 경우
        if (current.getLeftChild() == null
                && current.getRightChild() == null) {

            if (current == root) { // 루트가 삭제대상
                root = null;
            } else if (parent.getRightChild() == current) { // 삭제 대상이 부모의 오른쪽 자식이었다면
                parent.setRightChild(null);
            } else {
                parent.setLeftChild(null);
            }
        }
        // 삭제 대상 노드의 자식이 하나인 경우 - 왼쪽 자식인 경우
        else if (current.getRightChild() == null) {

            // 삭제 대상이 루트
            if (current == root) {
                root = current.getLeftChild();
            // 삭제 대상이 부모의 왼쪽 자식인 경우
            } else if (current == parent.getLeftChild()) {
                // 부모의 새로운 왼쪽자식으로 삭제대상의 자식을 연결
                parent.setLeftChild(current.getLeftChild());
            // 삭제 대상이 부모의 오른쪽 자식인 경우
            } else {
                // 부모의 새로운 오른쪽자식으로 삭제대상의 자식을 연결
                parent.setRightChild(current.getLeftChild());
            }

        }
        // 삭제 대상 노드의 자식이 하나인 경우 - 오른쪽 자식인 경우
        else if (current.getLeftChild() == null) {
            // 삭제 대상이 루트
            if (current == root) {
                root = current.getRightChild();
            // 삭제 대상이 부모의 왼쪽 자식인 경우
            } else if (current == parent.getLeftChild()) {
                // 부모의 새로운 왼쪽자식으로 삭제대상의 자식을 연결
                parent.setLeftChild(current.getRightChild());
            // 삭제 대상이 부모의 오른쪽 자식인 경우
            } else {
                // 부모의 새로운 오른쪽자식으로 삭제대상의 자식을 연결
                parent.setRightChild(current.getRightChild());
            }
        }
        // 삭제 대상 노드의 자식이 둘인 경우
        else {
            // 삭제 노드를 대체할 후보 노드 찾기
            Node candidate = getCandidate(current);

            if (current == root) {
                root = candidate;
            } else if (current == parent.getLeftChild()) {
                parent.setLeftChild(candidate);
            } else {
                parent.setRightChild(candidate);
            }

            candidate.setLeftChild(current.getLeftChild());
        }

        return true;
    }

    // 후보 노드 찾기
    private Node getCandidate(Node deleteNode) {

        Node candidateParent = deleteNode;
        Node candidate = candidateParent.getRightChild();

        // 삭제노드 오른족 자식의 왼쪽 자식 찾기
        while (candidate.getLeftChild() != null) {
            candidateParent = candidate;
            candidate = candidate.getLeftChild();
        }

        // 후보노드가 삭제노드 오른쪽 자식의 왼쪽자식일 때
        if (candidate != deleteNode.getRightChild()) {
            candidateParent.setLeftChild(candidate.getRightChild());
            candidate.setRightChild(deleteNode.getRightChild());
        }

        return candidate;
    }


    // 빈 트리인지 확인
    public boolean isEmpty() {
        return root == null;
    }


    public Node getRoot() {
        return root;
    }
}
