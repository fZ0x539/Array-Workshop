package se.lexicon;

import java.util.Arrays;

/**
 * The NameRepository class provides methods to manage a list of names.
 * It offers functionalities such as adding, removing, finding, and updating names.
 */
public class NameRepository {

    private static String[] names = new String[0]; // element format should be ["firstName lastName", "firstName lastName"]


    /**
     * Retrieves the current size of the names array.
     *
     * @return The number of elements in the names array.
     */
    public static int getSize() {
        //todo: PART 1: implement getSize method
        return names.length;
    }


    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param names The array of names to set.
     */
    public static void setNames(final String[] names) {
        //todo: PART 1: implement setNames method
        NameRepository.names = names;
    }


    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {
        //todo: PART 1: implement clear method
        NameRepository.names = new String[0];
    }


    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {
        //todo: PART 1: implement findAll method

        return Arrays.copyOf(names, names.length);
    }


    /**
     * Finds a name that matches the given fullName case-insensitively.
     *
     * @param fullName The full name to search for.
     * @return The matching name if found; otherwise, null.
     */
    public static String find(final String fullName) {
        //todo: PART 2: implement find method
        for(String name : names){
            if(fullName.equalsIgnoreCase(name))
                return name;
        }
        return null;
    }


    /**
     * Adds a new fullName to the names array if it doesn't already exist.
     *
     * @param fullName The full name to add.
     * @return True if the fullName is added successfully; false if it already exists.
     */
    public static boolean add(final String fullName) {
        //todo: PART 2: implement add method
        if(find(fullName) != null)
            return false;
        String[] tempNames = Arrays.copyOf(names, names.length + 1 );
        tempNames[tempNames.length - 1] = fullName;
        names = tempNames;
        return true;
    }


    /**
     * Find all names that match the given firstName.
     *
     * @param firstName The first name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByFirstName(final String firstName) {
        //todo: PART 3: findByFirstName method
        int occurrenceCount = 0;
        for(String name : names){
            String[] splitNames = name.split(" ");
            if(splitNames[0].equalsIgnoreCase(firstName))
                occurrenceCount++;
        }
        if(occurrenceCount == 0)
            return null;

        String[] matchingNames = new String[occurrenceCount];
        int index = 0;
        for(int i = 0; i < names.length; i++){
            String[] splitNames = names[i].split(" ");
            if(splitNames[0].equalsIgnoreCase(firstName)){
                matchingNames[index] = names[i];
                index++;
            }
        }
        return matchingNames;
    }


    /**
     * Find all names that match the given lastName.
     *
     * @param lastName The last name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByLastName(final String lastName) {
        //todo: PART 3: implement findByLastName method
        int occurrenceCount = 0;
        for(String name : names){
            String[] splitNames = name.split(" ");
            if(splitNames[1].equalsIgnoreCase(lastName))
                occurrenceCount++;
        }
        if(occurrenceCount == 0)
            return null;

        String[] matchingNames = new String[occurrenceCount];
        int index = 0;
        for(int i = 0; i < names.length; i++){
            String[] splitNames = names[i].split(" ");
            if(splitNames[1].equalsIgnoreCase(lastName)){
                matchingNames[index] = names[i];
                index++;
            }
        }
        return matchingNames;
    }


    /**
     * Updates a name in the names array from the original name to the updated name.
     *
     * @param original    The original name to update.
     * @param updatedName The updated name to set.
     * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
     */
    public static boolean update(final String original, final String updatedName) {
        //todo: PART 3: implement update method
        for(String name : names){
            if(name.equalsIgnoreCase(updatedName))
                return false;
        }

        for(int i = 0; i < names.length; i++){
            if(names[i].equalsIgnoreCase(original)){
                names[i] = updatedName;
                return true;
            }
        }
        return false;
    }


    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(final String fullName) {
        //todo: PART 4: implement remove method
        return false;
    }


}