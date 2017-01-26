package com.kawnayeen.java8.lamda._3_function_intefaces._1_consumer;

import java.util.function.ObjLongConsumer;

/**
 * Created by kawnayeen on 1/26/17.
 */
public class _8_ObjectLongConsumer {
    public static void main(String[] args){
        ObjLongConsumer<User> setUniqueId = (user,generatedId)->{
            System.out.println(user.toString());
            user.setId(generatedId);
            System.out.println(user.toString());
        };

        User user = new User("Kawnayeen");
        Long generatedId = Long.MAX_VALUE;
        setUniqueId.accept(user,generatedId);
    }
}

class User{
    Long id;
    String name;

    public User(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

