package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = (Solution) solution.clone();

        System.out.println(solution);
        System.out.println(clone);

        System.out.println(solution.users);
        System.out.println(clone.users);


        System.out.println(solution.users.get("Hubert") == clone.users.get("Hubert"));
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Solution clone = (Solution) super.clone();
        Map<String, User> cloneLinkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, User> entry : this.users.entrySet()) {
            cloneLinkedHashMap.put(entry.getKey(), (User) entry.getValue().clone());
        }
        clone.users = cloneLinkedHashMap;
        return clone;
    }

    protected Map<String, User> users = new LinkedHashMap<>();

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
