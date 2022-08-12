package GenericType.IntroductionGeneric;
    class GenericTypeIntroduction<T>{
        private T x;
        private T y;

        public GenericTypeIntroduction(T x, T y) {
            this.x = x;
            this.y = y;



        }

        public T getX() {
            return x;
        }

        public void setX(T x) {
            this.x = x;
        }

        public T getY() {
            return y;
        }

        public void setY(T y) {
            this.y = y;
        }
        public void printInfo(){
            System.out.println("type x :" + x + " Type y : " + y);

        }

        @Override
        public String toString() {
            return "GenericTypeIntroduction{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
class Person<X,Y,Z>{
        private X name;
        private Y surname;
        private Z  age;

    public Person(X name, Y surname, Z age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public X getName() {
        return name;
    }


    public void setName(X name) {
        this.name = name;
    }

    public Y getSurname() {
        return surname;
    }

    public void setSurname(Y surname) {
        this.surname = surname;
    }

    public Z getAge() {
        return age;
    }

    public void setAge(Z age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", surname=" + surname +
                ", age=" + age +
                '}';
    }
}


public class IntroductionToGeneric {

    public static void main(String[] args) {

        GenericTypeIntroduction<Integer> integerGenericTypeIntroduction = new GenericTypeIntroduction<>(10, 15);
        integerGenericTypeIntroduction.printInfo();
        System.out.println(integerGenericTypeIntroduction.toString());

        GenericTypeIntroduction<String> stringGenericTypeIntroduction = new GenericTypeIntroduction<>("Adam", "Małysz");
        System.out.println(stringGenericTypeIntroduction.toString());

        Person<String, String, Integer> person1 = new Person<>("Jas", "Mela", 34);
        System.out.println(person1.toString());

    }
}
