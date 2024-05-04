public class ResidentialCarGarage extends Building {

    /**
     * Number of cars accommodated
     */
    private int cars;

    /**
     * Default constructor
     */
    public ResidentialCarGarage() {
        super("garage");
    }

    /**
     * Describe car space
     */
    public void parking() {
        String noun = (this.cars > 1) ? "cars" : "car";
        System.out.printf("\nThis %s can accommodate %d %s.",
                this.buildingDescription, this.cars, noun);
    }

    /**
     * Method that uses the number of cars as the basis for comparison.
     *
     * @param o Object with residential car garage.
     *
     * @return -1, 0, 1 as the comparison is less than, equal to,
     * or greater than the specified object,the residential car garage.
     */
    public int compareTo(ResidentialCarGarage o) {
        //return 0 if the compared value is equal
        int valueToReturn = 0;
        //return -1 if the compared value is less
        if (this.cars < o.cars) {
            valueToReturn = -1;
            //return 1 if the compared value is greater
        } else if (this.cars > o.cars) {
            valueToReturn = 1;
        }
        return valueToReturn;
    }
}
