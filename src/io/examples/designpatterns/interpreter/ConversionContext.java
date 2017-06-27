package io.examples.designpatterns.interpreter;

public class ConversionContext {

    private String conversionQues = "";
    private String conversionResponse = "";
    private String fromConversion = "";
    private String toConversion = "";
    private double quantity;

    String[] partsOfQues;

    public ConversionContext(String input) {

        this.conversionQues = input;

        partsOfQues = getInput().split(" ");

        fromConversion = getCapitalized(partsOfQues[1]);

        toConversion = getLowerCase(partsOfQues[3]);

        quantity = Double.valueOf(partsOfQues[0]);

        conversionResponse = partsOfQues[0] + " " + partsOfQues[1] + " equals ";

    }

    public String getInput() {
        return conversionQues;
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public String getResponse() {
        return conversionResponse;
    }

    public double getQuantity() {
        return quantity;
    }

    /**
     * Make String lowercase
     *
     * @param wordToLowercase
     * @return
     */
    public String getLowerCase(String wordToLowercase) {
        return wordToLowercase.toLowerCase();
    }

    /**
     * Capitalizes the first letter of a word
     *
     * @param wordToCapitalize
     * @return
     */
    public String getCapitalized(String wordToCapitalize) {

        // Make characters lower case

        wordToCapitalize = wordToCapitalize.toLowerCase();

        // Make the first character uppercase

        wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) +
                wordToCapitalize.substring(1);

        // Put s on the end if not there

        int lengthOfWord = wordToCapitalize.length();

        if (wordToCapitalize.charAt(lengthOfWord - 1) != 's') {

            wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfWord, "s").toString();

        }

        return wordToCapitalize;

    }

}
