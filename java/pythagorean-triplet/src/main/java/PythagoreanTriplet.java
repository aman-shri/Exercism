import java.util.List;
import java.util.ArrayList;

class PythagoreanTriplet {

    private int a;
    private int b;
    private int c;

    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {

        private int sum;
        private int maxFactor;

        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            List<PythagoreanTriplet> triplets = new ArrayList<>();
            for(int a = 1; a<sum; a++){
                for(int b = a+1; b<sum; b++){
                    int c = sum - a - b;
                    if(c <= b){
                        break;
                    }
                    if(a*a + b*b == c*c && a<= maxFactor && b <= maxFactor && c <= maxFactor) {
                        triplets.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
            return triplets;
        }
    }

}