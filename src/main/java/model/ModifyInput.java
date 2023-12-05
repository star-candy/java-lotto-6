package model;

import java.util.ArrayList;
import java.util.List;
import constants.Description;

public class ModifyInput {
    public List<Integer> inputToList(String inputString) {
        List<Integer> dataList = new ArrayList<>();
        try {
            String[] splitData = inputString.split(",");
            for (String data : splitData) {
                int intValue = Integer.parseInt(data.trim());
                dataList.add(intValue);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(Description.NUMBER_SPLIT_EXCEPTION.getMessage());
            throw new IllegalArgumentException();
        }
        return dataList;
    }
}
