package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum StateEnum implements StringIdentifiable {
        STATE0("state0"),
        STATE1("state1"),
        STATE2("state2"),
        STATE3("state3"),
        STATE4("state4");

        private final String name;

        private StateEnum(String name){
            this.name = name;
        }

        public String toString(){
            return this.name;
        }

    @Override
    public String asString() {
        return this.name;
    }
}

