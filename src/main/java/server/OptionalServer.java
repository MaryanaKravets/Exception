package main.java.server;

import java.util.Optional;

class OptionalServer {
    static void checkOnPalindrom(String string) throws NotPalindromException {
        Optional<String> stringOptional = Optional.of(string);
        StringBuilder str1 = new StringBuilder(string);
        stringOptional.filter(str -> (str.equals(str1.reverse().toString())))
                .orElseThrow(() -> new NotPalindromException("Word which you entered is not a palindrom!"));
    }

    static void checkOnEvenAndGreater(Integer integer) throws NotEvenException, GreaterThanHundredException {
        Optional<Integer> integerOptional = Optional.of(integer);
        integerOptional.filter(i -> i <= 100)
                .orElseThrow(() -> new GreaterThanHundredException("Number which you entered is greater than 100!"));
        integerOptional.filter((i -> (i % 2) == 0))
                .orElseThrow(() -> new NotEvenException("Number which you entered is not even!"));
    }

    static void checkOnNull(Object object) throws NullObjectException {
        Optional.ofNullable(object).filter(i -> (!i.equals("null")))
                .orElseThrow(() -> new NullObjectException("You entered null!"));
    }
} 

