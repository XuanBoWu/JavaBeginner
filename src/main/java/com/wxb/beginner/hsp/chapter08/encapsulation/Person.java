package com.wxb.beginner.hsp.chapter08.encapsulation;

/**
 * 那么在java中如何实现这种类似的控制呢？ 请大家看一个小程序
 * 不能随便查看人的年龄，工资等隐私，并对设置的年龄进行合理的验证。年龄合理就设置，否则给默认年龄，必须在 1-120，年龄，工资不能直接查看，
 * name的长度在2-6字符之间
 */
public class Person {
    public String name;
    private int age;
    private double salary;//薪水
    private String job;

    public Person() {
    }

    public Person(String name, int age, double salary, String job) {
        setName(name);
        setAge(age);
        setSalary(salary);
        setJob(job);
    }

    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary + " jog=" + job;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 6 && name.length() >= 2){
            this.name = name;
        } else {
            System.out.println("名字长度有误，默认为张三");
            this.name = "张三";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120){
            this.age = age;
        } else {
            System.out.println("年龄输入有误，输入默认值18岁");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("小1");
        p.setAge(43);
        p.setSalary(5000);
        p.setJob("工程师");
        System.out.println(p.info());

        Person jack = new Person("jack", 123, 50000, "产品经理");
        System.out.println(jack.info());
    }
}
