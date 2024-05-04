public class Building implements Comparable<Building> {

    /**
     * Description of the building
     */
    protected String buildingDescription;

    /**
     * Number of floors or levels
     */
    private int floors;

    /**
     * Type of roof material
     */
    private String roofMaterial;

    /**
     * Roof design
     */
    private String roofDesign;

    /**
     * Entrance shape
     */
    private String entranceShape;

    /**
     * Entrance material
     */
    private String entranceMaterial;

    /**
     * Simple constructor
     */
    public Building(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }


    /**
     * Description of roof
     */
    public void roof() {
        System.out.printf("\nThis %s has a %s roof made of %s.",
                this.buildingDescription, this.roofDesign, this.roofMaterial);
    }

    /**
     * Description of entrance
     */
    public void entrance() {
        System.out.printf("\nThis %s has a %s style entrance made of %s",
                this.buildingDescription, this.entranceShape, this.entranceMaterial);
    }


    /*
    ACCESSORS AND MUTATORS
     */

    public String getBuildingDescription() {
        return buildingDescription;
    }

    public void setBuildingDescription(String buildingDescription) {
        this.buildingDescription = buildingDescription;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getRoofMaterial() {
        return roofMaterial;
    }

    public void setRoofMaterial(String roofMaterial) {
        this.roofMaterial = roofMaterial;
    }

    public String getRoofDesign() {
        return roofDesign;
    }

    public void setRoofDesign(String roofDesign) {
        this.roofDesign = roofDesign;
    }

    public String getEntranceShape() {
        return entranceShape;
    }

    public void setEntranceShape(String entranceShape) {
        this.entranceShape = entranceShape;
    }

    public String getEntranceMaterial() {
        return entranceMaterial;
    }

    public void setEntranceMaterial(String entranceMaterial) {
        this.entranceMaterial = entranceMaterial;
    }

    /**
     * Method that compares the number of floors because there is a natural order.
     * Something like roofMaterial has no natural order implemented.
     *
     * @param o Object with building floors.
     *
     * @return -1, 0, 1 as the comparison is less than, equal to,
     * or greater than the specified object,the building floors.
     */
    public int compareTo(Building o) {
       //return 0 if the compared value is equal
        int valueToReturn = 0;
        //return -1 if the compared value is less
        if (this.getFloors() < (o.getFloors())) {
            valueToReturn = -1;
            //return 1 if the compared value is greater
        } else if (this.getFloors() > o.getFloors()) {
            valueToReturn = 1;
        }
        return valueToReturn;

    }
}