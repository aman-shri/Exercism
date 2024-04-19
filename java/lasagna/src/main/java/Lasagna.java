public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        int remainingMinutes = expectedMinutesInOven() - actualMinutes;
        return remainingMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers){
        int preprationTime = numberOfLayers*2;
        return preprationTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
        int totalTime = preparationTimeInMinutes(numberOfLayers) + minutesInOven;
        return totalTime;
    }
}
