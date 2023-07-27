package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        List<Integer> result = new ArrayList<>();

        return (x) -> {
            for (Integer number : x) {
                result.add(number / divider);
            }
            return result;
        };
    }
}
