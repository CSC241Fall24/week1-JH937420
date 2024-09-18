public class Bulbasaur {
    private int id;
    private int level;

    // Constructor
    public Bulbasaur() {
        id = 1;
        level = 1;
    }

    // setLevel method
    public void setLevel(int lv) {
        // Update the level
        this.level = lv;
        // If the new level is 16 or higher but less than 32, evolve to Ivysaur
        if (lv >= 16 && lv < 32) {
            id = 2;
        }
        // If the new level is 32 or higher, evolve to Venusaur
        else if (lv >= 32){
            id = 3;
        }
    }

    // getLevel method
    public int getLevel() {
        return level;
    }

    // getName method
    public String getName() {
        // Return the name based on the current id
         if (id == 1) {
            return "Bulbasaur";
         } else if (id == 2){
            return "Ivysaur";
         } else if (id == 3){
            return "Venusaur";
         } else {
            return null;
         }
    }

    // getID method
    public int getID() {
        return id;
    }

    // toString method
    @Override
    public String toString() {
        // Return a string representation of the Bulbasaur object
        return "Level: " + getLevel() + ", ID: " + getID();
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
        // Compare this Bulbasaur object with another object
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Bulbasaur bulbasaur = (Bulbasaur) obj;

        if (id != bulbasaur.id) return false;
        return level == bulbasaur.level;
    }

    // copy method
    public Bulbasaur copy() {
        // Create and return a new Bulbasaur object with the same id and level
        Bulbasaur copy = new Bulbasaur();
        copy.id = this.id;
        copy.level = this.level;
        return copy;
    }
}