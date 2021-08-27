package ru.devteam.examples;

import java.util.*;

public class CollectionInterfaceExamples {
    public static void main(String[] args) {

        List names = Arrays.asList("Java", "C", "C++","Python","JavaScript", "Python");


        Set namesSet = new HashSet<String>();
        namesSet.add("Java");
        namesSet.add("C");
        namesSet.add("C++");
        namesSet.add("Python");
        namesSet.add("JavaScript");
        namesSet.add("Python");


        Iterator listIterator = names.iterator();
        Iterator setIterator = namesSet.iterator();


        System.out.println("Print List elements:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Print Set elements:");
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }
    }
}

// Interface: Iterator
// Methods:
// E (element of particular type)  next()
// boolean hasNext()
// void remove()


// Interface: Iterable
// Methods:
// Iterator<T> iterator()


// Interface: List
// Methods:
//size
//isEmpty
//contains
//iterator
//toArray
//toArray
//add
//remove
//containsAll
//addAll
//addAll
//removeAll
//retainAll
//replaceAll
//sort
//clear
//equals
//hashCode
//get
//set
//add
//remove
//indexOf
//lastIndexOf
//listIterator
//listIterator
//subList
//spliterator