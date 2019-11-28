package ListAndArrayListsVersion2;
import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    // 1) Add at grocery List an Item
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    // 2) print grocery List
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list ");
        for (int i=0; i<groceryList.size();i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    // 3) modify grocery list
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified");
    }
    //////// 2nd /////////
    public void modifyGroceryItem(String currentItem,String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }

    // 4) remove item from grocery list
    private void removeGroceryItem(int position){
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    // 5) find item from grocery list
    private int findItem(String searchItem){
        // contains() method return true if find the item in groceryList in other case return false
        /*boolean exists = groceryList.contains(searchItem);
        //returns the index position of search item with method indexOf()
        //if return -1 means that element does not exist in other case means that find the searchitem
        int position = groceryList.indexOf(searchItem);
        if (position >= 0){
            return groceryList.get(position);
        }
        return null;

         */
        //2nd way//
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }

        return false;
    }
}
