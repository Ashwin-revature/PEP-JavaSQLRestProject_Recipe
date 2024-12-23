package com.revature.dao;
import com.revature.util.ConnectionUtil;
import com.revature.util.Page;
import com.revature.util.PageOptions;
import com.revature.model.Ingredient;
import java.util.List;



/**
 * The IngredientDao class handles the CRUD operations for Ingredient objects.
 * It provides methods for creating, retrieving, updating, and deleting Ingredient records
 * from the database. This class relies on the ConnectionUtil class for database connectivity
 * and also supports searching and paginating through Ingredient records.
 */

public class IngredientDAO {

    /**
     * A utility class used for establishing connections to the database.
     */

    @SuppressWarnings("unused")
    private ConnectionUtil connectionUtil;

    /**
     * Constructs an IngredientDao with the specified ConnectionUtil for database connectivity.
     * 
     * @param connectionUtil the utility used to connect to the database
     */

    public IngredientDAO(ConnectionUtil connectionUtil) {
        this.connectionUtil = connectionUtil;
    }

    /**
     * Creates a new ingredient in the database.
     * 
     * @param ingredient the Ingredient object to create
     * @return the ID of the newly created ingredient
     */

    public int createIngredient(Ingredient ingredient) {
        // Implementation
        return(0); //returns the new created id
    }

    /**
     * Retrieves all ingredients from the database.
     * 
     * @return a list of all Ingredient objects
     */

    public List<Ingredient> getAllIngredients() {
        // Implementation
        return(null);//returns the list of all Ingredient objects
    }

    /**
     * Retrieves a paginated list of all ingredients from the database.
     * 
     * @param pageOptions options for pagination, including page size and page number
     * @return a paginated list of Ingredient objects
     */

    public Page<Ingredient> getAllIngredients(PageOptions pageOptions) {
        // Implementation
        return(null);//returns a paginated list of Ingredient objects
    }

    /**
     * Searches for ingredients based on a specified term.
     * 
     * @param term the search term to filter ingredients by
     * @return a list of Ingredient objects that match the search term
     */

    public List<Ingredient> searchIngredients(String term) {
        // Implementation
        return(null);//returns the list of Ingredient objects that match the search term
    }

    /**
     * Searches for ingredients based on a specified term and returns a paginated result.
     * 
     * @param term the search term to filter ingredients by
     * @param pageOptions options for pagination, including page size and page number
     * @return a paginated list of Ingredient objects that match the search term
     */

    public Page<Ingredient> searchIngredients(String term, PageOptions pageOptions) {
        // Implementation
        return(null);//returns a paginated list of Ingredient objects that match the search term
    }

    /**
     * Retrieves a specific ingredient by its ID.
     * 
     * @param id the ID of the ingredient to retrieve
     * @return the Ingredient object corresponding to the given ID
     */

    public Ingredient getIngredientById(int id) {
        // Implementation
        return(null);//returns the Ingredient object corresponding to the given ID
    }

    /**
     * Updates an existing ingredient in the database.
     * 
     * @param ingredient the Ingredient object with updated data
     */

    public void updateIngredient(Ingredient ingredient) {
        // Implementation
    }

    /**
     * Deletes a specific ingredient from the database.
     * 
     * @param ingredient the Ingredient object to delete
     */
    
    public void deleteIngredient(Ingredient ingredient) {
        // Implementation
    }
}
