package org.uzum.iggytoto.javacore_exceptions;

public class Program {


    public static void main(String[] args) {
        final PersonExceptions p = new PersonExceptions();
        try {
            p.setName("ise");
            System.out.println(p.getName());
            p.getName2();
        } catch (NameNotFilledException | IllegalStateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }


    public static class PersonExceptions {
        private String name;

        public String getName() throws NameNotFilledException  {
            if(name == null){
                throw new NameNotFilledException(this);
            }
            return name;
        }

        /**
         *
         * @return
         * @throws IllegalStateException - in case name = "ise"
         */
        public String getName2() throws IllegalStateException {
            if("ise".equals(name) ){
                throw new IllegalStateException("ERROR: asdasdasd");
            }
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class NameNotFilledException extends Exception {
        public NameNotFilledException(PersonExceptions p){
            super("ERROR: Name not filled for given person:" + p.hashCode());
        }

    }
}
