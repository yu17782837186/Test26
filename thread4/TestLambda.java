package cn.com.thread;

public class TestLambda {
    //静态内部类
//    static class Test implements Runnable {
//        @Override
//        public void run() {
//            for (int i = 0; i < 200; i++) {
//                System.out.println("一边听歌");
//            }
//        }
//    }

    public static void main(String[] args) {
        //new Thread(new Test()).start();
        //局部内部类
//        class Test implements Runnable {
//        @Override
//        public void run() {
//            for (int i = 0; i < 20; i++) {
//                System.out.println("一边听歌");
//            }
//        }
//    }
//    new Thread(new Test()).start();
        //匿名内部类 必须借助接口或者父类
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println("一边听歌");
//                }
//            }
//        }).start();
        //lambda表达式
//        new Thread(()->{
//            for (int i = 0; i < 20; i++) {
//                System.out.println("一边听歌");
//            }
//        }).start();
//    }
        Ilike like = new Like();
        like.lambda();
    }

    interface Ilike {
        void lambda();
    }

    static class Like implements Ilike {
        @Override
        public void lambda() {
            System.out.println("i like lambda");
        }
    }
}