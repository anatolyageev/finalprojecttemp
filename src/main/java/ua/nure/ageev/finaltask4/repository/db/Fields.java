package ua.nure.ageev.finaltask4.repository.db;

/**
 * Holder for fields names of DB tables and beans.
 * 
 * @author D.Kolesnikov
 * 
 */
public final class Fields {
	private Fields(){
		// not need to implement because constructor is privet to avoid attempt to instance creation
	}
	// entities
	public static final String ENTITY_ID = "id";
	
	public static final String USER_LOGIN = "user_name";
	public static final String USER_PASSWORD = "password";
	public static final String USER_FIRST_NAME = "first_name";
	public static final String USER_LAST_NAME = "last_name";
	public static final String USER_ROLE_ID = "role_id";
	public static final String USER_STATUS = "user_status";

	public static final String SUBJECT_NAME = "subject_name";

	public static final String TEST_DIFFICULTY_LEVEL = "difficulty";
	public static final String TEST_MINUTES_TO_COMPLETE = "min_to_complete";
	public static final String TEST_NAME = "test_name";
	public static final String TEST_QUESTION_QUANTITY = "question_quantity";

	public static final String QUESTION_TEXT = "question_text";

	public static final String ORDER_BILL = "bill";
	public static final String ORDER_USER_ID = "user_id";
	public static final String ORDER_STATUS_ID= "status_id";

	public static final String CATEGORY_NAME = "name";
	
	public static final String MENU_ITEM_PRICE = "price";
	public static final String MENU_ITEM_NAME = "name";
	public static final String MENU_ITEM_CATEGORY_ID = "category_id";	

	// beans
	public static final String USER_ORDER_BEAN_ORDER_ID = "id";	
	public static final String USER_ORDER_BEAN_USER_FIRST_NAME = "first_name";	
	public static final String USER_ORDER_BEAN_USER_LAST_NAME = "last_name";	
	public static final String USER_ORDER_BEAN_ORDER_BILL = "bill";	
	public static final String USER_ORDER_BEAN_STATUS_NAME = "name";
	
}