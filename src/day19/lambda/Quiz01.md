#### 다음 코드 실행 결과는 4, 5, 6, 42 중 무엇?

```java
public class MeaningOfThis {

    public final int value = 4;

    public void doIt() {
        int value = 6;
        Runnable r = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                int value = 42;
                System.out.println(this.value);
            }
        };
    }
    
    public static void main(String[] args) {
        MeaningOfThis m = new MeaningOfThis();
        m.doIt();
    }
}

```


---
정답: 5