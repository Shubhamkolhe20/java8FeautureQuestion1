import EMP.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1........1st emp get salary <300000
        //List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 52, 62, 34, 8, 2, 3, 4, 5, 6, 7, 8, 9);
        // long a = list.stream().count();
        //System.out.println(a);
        //1...............remove duplicate and sort dec order
//        List<Integer> collect = list.stream().distinct().
//                sorted(Comparator.reverseOrder()).
//                collect(Collectors.toList());
//        System.out.println(collect);

        //  2....................
        //find odd and make them square and return
//        List<Integer> collect = list.stream()
//                .distinct()
//                .filter(x -> x % 2 != 0)
//                .map(x -> x * x)
//                .collect(Collectors.toList());
//                System.out.println(collect);

        //3.............
        //get 2nd 3rd element of it and return them a ,list
//        try {
//            if (list.size() <= 20) {
//                list.stream()
//                        .skip(1)
//                        .limit(2)
//                        .forEach(System.out::println);
//            }
//            else {
//                throw new RuntimeException("List contains more than 20 elements");
//            }
//        } catch (RuntimeException e) {
//            System.out.println("Exception: " + e.getMessage());
//        }

        //4.............
        //find a second higest number in a list


        //List<Integer> list1 = Arrays.asList(20, 21, 20);
//        try {
//            Optional<Integer> first  = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//            if(first.isEmpty()){
//                throw  new RuntimeException("NOT FOUND");
//            }
//            System.out.println(first.get());
//        } catch (Exception e) {
//           // throw new RuntimeException("not found");
//            System.out.println(e.getMessage());
//        };

        //5.............divide no. into even  & odd
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
//        //divide a list into 2 part one contain odd and other contain even
//        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
//        System.out.println("Even numbers: " + collect.get(true));
//        System.out.println("Odd numbers: " + collect.get(false));

        //6......... return a longest string
        //List<String> str = Arrays.asList("Java", "SpringBoot", "Microservices", "SQL");
//        try {
//            str.stream().max(Comparator.comparing(String::length)).ifPresent(System.out::println);
//            str.stream().min(Comparator.comparing(String::length)).ifPresent(System.out::println);
//            if (str.isEmpty()){
//                throw new Exception("Empty String");
//            }
//        } catch (Exception e) {
//            //throw new RuntimeException(e);
//            System.out.println(e.getMessage());
//            str.forEach(System.out::println);
//        }
//        List<Employee> list = new ArrayList<>(Arrays.asList(
//                new Employee("shubham", "kolhe", 200000,"IT"),
//                new Employee("Bittu", "kolhe", 200000, "IT"),
//                new Employee("Rahul", "Sharma", 450000, "HR"),
//                new Employee("Priya", "Patil", 350000, "Finance"),
//                new Employee("Amit", "Verma", 600000, "IT"),
//                new Employee("Sneha", "Joshi", 250000, "HR"),
//                new Employee("tara", "Verma", 600000, "Finance"),
//                new Employee("karan", "Joshi", 250000, "IT"),
//                new Employee("Vikas", "Singh", 500000, "Finance"),
//                new Employee("Neha", "Gupta", 400000, "HR"),
//                new Employee("Karan", "Deshmukh", 300000, "IT")
//        ));
//        //list.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
////        Optional<Employee> first = list.stream().sorted(Comparator.comparing(Employee::getSalary))
////                .filter(s -> s.getSalary() > 300000)
////                .findFirst();
////
////        if(first.isPresent()) {
////            System.out.println(first.get());
////        }
////        else {
////            System.out.println("No employees found");
//        //6...................
//        //find top 2 highest paid employee
//        // list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).forEach(System.out::println);
//
//        //7.........sort emp by salary, them by name
//
////        list.stream().sorted(Comparator.comparing((Employee e) -> e.getSalary()).thenComparing((Employee e) -> e.getFirstName()))
////                .forEach(System.out::println);
//
//        //8.............count how many emp in each department
////        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(e -> e.getDepartment(), Collectors.counting()));
////        System.out.println(collect);
//
//        //9........ sum total salary in each department
////        Map<String, Double> collect = list.stream().collect(Collectors.groupingBy(e -> e.getDepartment()
////                , Collectors.summingDouble(Employee::getSalary)));
////        System.out.println(collect);
//
//        //10..........finf the averave salary of emp in each department
//        // 10. Find the average salary of employees in each department
//
////        list.stream()
////                .collect(Collectors.groupingBy(
////                        e -> e.getDepartment(),
////                        Collectors.averagingDouble(e -> e.getSalary())
////                ))
////                .forEach((department, averageSalary) ->
////                        System.out.println(department + " : " + averageSalary)
////                );
//        //11...higest paid emp in each department
//        Map<String, Optional<Employee>> collect = list.stream().collect(Collectors.groupingBy(e -> e.getDepartment()
//                , Collectors.maxBy(Comparator
//                        .comparing(e -> e.getSalary()))));
//
//        collect.forEach((department, emp) ->
//                emp.ifPresent(e -> System.out.println(
//                        department + " : " + e.getFirstName() + " " + e.getLastName()
//                                + " | Salary: " + e.getSalary()
//                ))
//        );

        //11 remove duplicate and add all of them inton a single list

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(3, 4, 5, 6),
                Arrays.asList(7, 8, 1, 2),
                Arrays.asList(9, 10, 5, 6),
                Arrays.asList(11, 12, 7, 8)
        );

        int intStream = listOfLists.stream().flatMap(e -> e.stream()).distinct().mapToInt(Integer::intValue).sum();
        System.out.println(intStream);



    }
}