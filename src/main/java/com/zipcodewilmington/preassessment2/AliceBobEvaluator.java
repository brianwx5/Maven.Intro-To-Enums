package com.zipcodewilmington.preassessment2;


public class AliceBobEvaluator {

    private String name;

    public AliceBobEvaluator(String input) {
        this.name = input.toUpperCase();
    }

    public boolean isAlice() {
        return this.name.equals(AliceBobEnum.ALICE.getName());
    }

    public boolean isBob() {
        return this.name.equals(AliceBobEnum.BOB.getName());
    }
}
