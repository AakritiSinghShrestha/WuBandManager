package com.codedifferently;


public class BandManager {
    private final WuMember[] wuMemberArray;

    public BandManager(WuMember[] wuMemberArray) {

        this.wuMemberArray = wuMemberArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter =0;
        // while `counter` is less than length of array
        while(counter<wuMemberArray.length){
            result +=wuMemberArray[counter];
            counter++;
        }
        //while(counter)
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        int counter=0;
        // identify terminal condition
        // identify increment
for(counter=0;counter<wuMemberArray.length;counter++){

result += wuMemberArray[counter];

}
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for(WuMember counter : wuMemberArray){
              result += counter;
        }
        return result;
    }


    public WuMember[] getwuMemberArray() {
        return wuMemberArray;
    }
}
