package org.javarush.E2;



public class External {
    public static int externalStaticVar = 1;

    private void externalMethod(){
    }

    public static class Nested {
        public Nested() {
        }

        void testMethod(){

        }

        void getValues(){
            this.testMethod();
        }

        private static void nestedMethod(){

        }

    }

}
