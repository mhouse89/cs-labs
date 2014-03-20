import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Calendar;


/**
 * The test class AnytownLibraryTest.
 *
 * @author  Franklin University
 * @version Winter 2014
 */
public class AnytownLibraryTest extends junit.framework.TestCase
{
    private static final String BOOK1 = "BOOK1";
    private static final String AUDIO1 = "AUDIO1";
    private static final String VIDEO1 = "VIDEO1";
    private static final String BOOK2 = "BOOK2";
    private static final String AUDIO2 = "AUDIO2";
    private static final String VIDEO2 = "VIDEO2";
    private static final String BOOK3 = "BOOK3";
    private static final int FIRST_COPY = 1;
    private static final int SECOND_COPY = 2;
    private static final int THIRD_COPY = 3;
    private static final int FOURTH_COPY = 4;
    private static final String BORROWER = "BORROWER 1";
    private static final String BORROWER2 = "BORROWER 2";
    private static final String BORROWER3 = "BORROWER 3";
    private static final GregorianCalendar DAY_1 = 
            new GregorianCalendar(2012, 9, 1, 0, 0);
    private static final GregorianCalendar DAY_15 = 
            new GregorianCalendar(2012, 9, 15, 0, 0);
    private static final GregorianCalendar DAY_370 =
            new GregorianCalendar(2013, 9, 15, 0, 0);
    private static final GregorianCalendar DAY_31 =
            new GregorianCalendar(2012, 9, 31, 0, 0);
    private static final GregorianCalendar DAY_32 = 
            new GregorianCalendar(2012, 10, 1, 0, 0);

    private AnytownLibrary library;

    /**
     * Default constructor for test class AnytownLibraryTest.
     */
    public AnytownLibraryTest()
    {
        // Default constructor
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
        library = new AnytownLibrary();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
        // Tear down test fixture
    }

    /**
     * Test constructor.
     */
    public void testContructor()
    {
        assertNotNull("Hint: Could not create an AnytownLibrary object. ",
                       library);
    }

    /**
     * Test adding single copies of items to the library.
     */
    public void testAddSingleCopyOfItem()
    {
        // Test adding a null item to library
        assertFalse("Hint: addItem() should return false if item is null. ",
                    library.addItem(null));

        // Test adding a single book to the library
        Book b = new Book();
        b.setCallNumber(BOOK1);
        assertTrue("Hint: addItem() should return true when a Book " +
                   "object is added. ",
                   library.addItem(b));
        assertEquals("Hint: getCopyNumber() should return 1 when first " +
                     "copy of a Book is added. ",
                     FIRST_COPY, b.getCopyNumber());

        // Test adding a single audio recording to the library
        AudioRecording a = new AudioRecording();
        a.setCallNumber(AUDIO1);
        assertTrue("Hint: addItem() should return true when an " +
                   "AudioRecording object is added. ",
                   library.addItem(a));
        assertEquals("Hint: getCopyNumber() should return 1 when first " +
                     "copy of an AudioRecording is added. ",
                     FIRST_COPY, a.getCopyNumber());

        // Test adding a single video recording to the library
        VideoRecording v = new VideoRecording();
        v.setCallNumber(VIDEO1);
        assertTrue("Hint: addItem() should return true when a " +
                   "VideoRecording object is added. ",
                   library.addItem(v));
        assertEquals("Hint: getCopyNumber() should return 1 when first " +
                     "copy of an VideoRecording is added. ",
                     FIRST_COPY, v.getCopyNumber());

        // Test adding a second book to the library
        Book b2 = new Book();
        b2.setCallNumber(BOOK2);
        assertTrue("Hint: addItem() should return true when a Book " +
                   "object is added. ",
                   library.addItem(b2));
        assertEquals("Hint: getCopyNumber() should return 1 when first " +
                     "copy of a Book is added. ",
                     FIRST_COPY, b2.getCopyNumber());

        // Test adding a second audio recording to the library
        AudioRecording a2 = new AudioRecording();
        a2.setCallNumber(AUDIO2);
        assertTrue("Hint: addItem() should return true when an " +
                   "AudioRecording object is added. ",
                   library.addItem(a2));
        assertEquals("Hint: getCopyNumber() should return 1 when first " +
                     "copy of an AudioRecording is added. ",
                     FIRST_COPY, a2.getCopyNumber());

        // Test adding a second video recording to the library
        VideoRecording v2 = new VideoRecording();
        v2.setCallNumber(VIDEO2);
        assertTrue("Hint: addItem() should return true when a " +
                   "VideoRecording object is added. ",
                   library.addItem(v2));
        assertEquals("Hint: getCopyNumber() should return 1 when first " +
                     "copy of an VideoRecording is added. ",
                     FIRST_COPY, v2.getCopyNumber());
    }

    /**
     * Test adding multiple copies of items to the library.
     */
    public void testAddMultipleCopiesOfItem()
    {

        // Test adding two copies of a book to the library
        Book b = new Book();
        Book b2 = new Book();
        b.setCallNumber(BOOK1);
        b2.setCallNumber(BOOK1);
        library.addItem(b);
        library.addItem(b2);
        assertEquals("Hint: getCopyNumber() should return 1 for the first " +
                     "copy of a Book added to library. ",
                     FIRST_COPY, b.getCopyNumber());
        assertEquals("Hint: getCopyNumber() should return 2 for the second " +
                     "copy of a Book added to library. ",
                     SECOND_COPY, b2.getCopyNumber());

        // Test adding two copies of an audio recording to the library
        AudioRecording a = new AudioRecording();
        AudioRecording a2 = new AudioRecording();
        a.setCallNumber(AUDIO1);
        a2.setCallNumber(AUDIO1);
        library.addItem(a);
        library.addItem(a2);
        assertEquals("Hint: getCopyNumber() should return 1 for the first " +
                     "copy of an AudioRecording added to library. ",
                     FIRST_COPY, a.getCopyNumber());
        assertEquals("Hint: getCopyNumber() should return 2 for the second " +
                     "copy of an AudioRecording added to library. ",
                     SECOND_COPY, a2.getCopyNumber());

        // Test adding two copies of a video recording to the library
        VideoRecording v = new VideoRecording();
        VideoRecording v2 = new VideoRecording();
        v.setCallNumber(VIDEO1);
        v2.setCallNumber(VIDEO1);
        library.addItem(v);
        library.addItem(v2);
        assertEquals("Hint: getCopyNumber() should return 1 for the first " +
                     "copy of a VideoRecording added to library. ",
                     FIRST_COPY, v.getCopyNumber());
        assertEquals("Hint: getCopyNumber() should return 2 for the second " +
                     "copy of a VideoRecording added to library. ",
                     SECOND_COPY, v2.getCopyNumber());
    }

    /**
     * Test finding single copies of items in the library.
     */
    public void testFindSingleCopyOfItem()
    {
        // Test finding single copies of a book in the library
        Book b = new Book();
        Book b2 = new Book();
        b.setCallNumber(BOOK1);
        b2.setCallNumber(BOOK2);
        library.addItem(b);
        library.addItem(b2);
        MediaItem [] items = library.findItems(BOOK1);
        assertEquals("Hint: findItems() should return smallest possible " +
                     "array with matching items", 1, items.length);
        assertEquals("Hint: findItems() returned array with incorrect " +
                     "contents. ",
                     b, items[0]);
        items = library.findItems(BOOK2);
        assertEquals("Hint: findItems() should return smallest possible " +
                     "array with matching items", 1, items.length);
        assertEquals("Hint: findItems() returned array with incorrect " +
                     "contents. ",
                     b2, items[0]);
    }

    /**
     * Test finding multiple copies of an item in the library.
     */
    public void testFindMultipleCopiesOfItem()
    {
        // Test finding multiple copies of an audio recording in the library
        AudioRecording a = new AudioRecording();
        AudioRecording a2 = new AudioRecording();
        AudioRecording a3 = new AudioRecording();
        a.setCallNumber(AUDIO1);
        a2.setCallNumber(AUDIO2);
        a3.setCallNumber(AUDIO1);
        library.addItem(a);
        library.addItem(a2);
        library.addItem(a3);
        MediaItem [] items = library.findItems(AUDIO1);
        assertEquals("Hint: findItems() should return smallest possible " +
                     "array with matching items", 2, items.length);
        assertEquals("Hint: findItems() returned array with incorrect " +
                     "contents. ",
                     a, items[0]);
        assertEquals("Hint: findItems() returned array with incorrect " +
                     "contents. ",
                     a3, items[1]);
        items = library.findItems(AUDIO2);
        assertEquals("Hint: findItems() should return smallest possible " +
                     "array with matching items", 1, items.length);
        assertEquals("Hint: findItems() returned array with incorrect " +
                     "contents. ",
                     a2, items[0]);
    }

    /**
     * Test finding no copies of an item in the library.
     */
    public void testFindNoCopiesOfItem()
    {
        // Test finding no copies of a video recording in the library
        VideoRecording v = new VideoRecording();
        VideoRecording v2 = new VideoRecording();
        v.setCallNumber(VIDEO1);
        v2.setCallNumber(VIDEO1);
        library.addItem(v);
        library.addItem(v2);
        MediaItem [] items = library.findItems(VIDEO2);
        assertEquals("Hint: findItems() should return array with length 0 " +
                     "when no matches found. ", 0, items.length);
    }

    /**
     * Test deleting the only item from the library.
     */
    public void testDeleteOnlyItem()
    {
        assertFalse("Hint: deleteItem() should return false when item " +
                "is null", library.deleteItem(null, 0));

        // Test if item or copy does not exist
        VideoRecording v = new VideoRecording();
        v.setCallNumber(VIDEO1);
        library.addItem(v);
        assertFalse("Hint: deleteItem() should return false when item not " +
                    "in library. ",
                    library.deleteItem(VIDEO2, FIRST_COPY));
        assertFalse("Hint: deleteItem() should return false when correct " +
                    "copy not in library. ",
                    library.deleteItem(VIDEO1, SECOND_COPY));
        assertEquals("Hint: deleteItem() should not delete anything if " +
                     "item not in library. ", 1,
                     library.findItems(VIDEO1).length);

        // Test deleting only copy in library
        assertTrue("Hint: deleteItem() should return true when item " +
                   "deleted. ",
                   library.deleteItem(VIDEO1, FIRST_COPY));
        assertEquals("Hint: deleteItem() did not remove copy of item " +
                     "from library. ", 0,
                     library.findItems(VIDEO1).length);
    }

    /**
     * Test adding and deleting items from the library.
     */
    public void testDeleteAndAddItems()
    {
        Book b = new Book();
        b.setCallNumber(BOOK1);
        library.addItem(b);
        b = new Book();
        b.setCallNumber(BOOK1);
        library.addItem(b);
        b = new Book();
        b.setCallNumber(BOOK1);
        library.addItem(b);

        // Test deleting the second copy in library
        assertTrue("Hint: deleteItem() should return true when deleting " +
                   "2nd copy of item. ",
                   library.deleteItem(BOOK1, SECOND_COPY));
        MediaItem [] items = library.findItems(BOOK1);
        assertEquals("Hint: deleteItem() did not remove second copy of " +
                     "item from library. ", 2,
                     items.length);
        assertEquals("Hint: deleteItem() removed wrong copy of item " +
                     "from library. ", FIRST_COPY, items[0].getCopyNumber());
        assertEquals("Hint: deleteItem() removed wrong copy of item " +
                     "from library. ", THIRD_COPY, items[1].getCopyNumber());

        // Test adding a new copy
        b = new Book();
        b.setCallNumber(BOOK1);
        library.addItem(b);
        assertEquals("Hint: addItem() should assign highest copy number " +
                     "+ 1 to item added to library after deletes. ",
                     FOURTH_COPY, b.getCopyNumber());
        assertEquals("Hint: findItems() returned wrong number of copies " +
                     "after copy deleted and then added to library. ",
                     3, library.findItems(BOOK1).length);
    }

    /**
     * Tests checking out an item.
     */
    public void testCheckOut()
    {
        // Test checking out an item
        Book b = new Book();
        b.setCallNumber(BOOK1);
        library.addItem(b);
        GregorianCalendar dueDate =
                          library.checkOut(BOOK1, FIRST_COPY, BORROWER,
                          DAY_1);
        assertEquals("Hint: checkOut() should return a date 30 days after " +
                     "date passed in. ", DAY_31,
                     dueDate);
        assertEquals("Hint: checkOut() should set the due date in the item " +
                     "to 30 days after the date passed in. ",
                     DAY_31,
                     b.getDueDate());

        // Test that a checked out item cannot be checked out again
        dueDate = library.checkOut(BOOK1, FIRST_COPY, BORROWER,
                                   DAY_31);
        assertNull("Hint: checkOut() should return null if item already " +
                     "checked out. ", dueDate);
        assertEquals("Hint: checkOut() should not reset the due date if " +
                     "item was already checked out. ",
                     DAY_31,
                     b.getDueDate());

        // Test that an item not in library cannot be checked out
        dueDate = library.checkOut(BOOK2, FIRST_COPY, BORROWER,
                                   DAY_1);
        assertNull("Hint: checkOut() should return null if item not in " +
                     "library. ", dueDate);

        // Test that a copy of an item not in library cannot be checked out
        dueDate = library.checkOut(BOOK1, SECOND_COPY, BORROWER,
                                   DAY_1);
        assertNull("Hint: checkOut() should return null if copy of item " +
                     "not in library. ", dueDate);

        // Test that the second copy of an item can be checked out
        b = new Book();
        b.setCallNumber(BOOK1);
        library.addItem(b);
        dueDate = library.checkOut(BOOK1, SECOND_COPY, BORROWER,
                                   DAY_1);
        assertNotNull("Hint: checkOut() should be able to check out the " +
                     "second copy of an item. ", dueDate);
        assertEquals("Hint: checkOut() should set the due date in the item " +
                     "to 30 days after the date passed in. ",
                     DAY_31,
                     b.getDueDate());
    }

    /**
     * Tests checking in an item.
     */
    public void testCheckIn()
    {
        // Test checking in an item
        VideoRecording v = new VideoRecording();
        v.setCallNumber(VIDEO1);
        library.addItem(v);
        library.checkOut(VIDEO1, FIRST_COPY, BORROWER,
                         DAY_1);
        assertTrue("Hint: checkIn() should return true when item checked " +
                   "back in. ", library.checkIn(VIDEO1, FIRST_COPY));
        assertNull("Hint: checkIn() should set due date in item to null. ",
                   v.getDueDate());
        assertNull("Hint: checkIn() should set borrower in item to null. ",
                   v.getBorrower());

        // Test that a checked in item cannot be checked in again
        assertFalse("Hint: checkIn() should fail if item is already " +
                    "checked in. ",
                    library.checkIn(VIDEO1, FIRST_COPY));

        // Test that an item not in library cannot be checked in
        assertFalse("Hint: checkIn() should fail if item not in library. ",
                    library.checkIn(VIDEO2, FIRST_COPY));

        // Test that a copy of an item not in library cannot be checked
        library.checkOut(VIDEO1, FIRST_COPY, BORROWER,
                         DAY_1);
        assertFalse("Hint: checkIn() should fail if copy of item not " +
                    "in library. ",
                    library.checkIn(VIDEO1, SECOND_COPY));

        // Test that the second copy of an item can be checked out
        v = new VideoRecording();
        v.setCallNumber(VIDEO1);
        library.addItem(v);
        library.checkOut(VIDEO1, SECOND_COPY, BORROWER,
                         DAY_1);
        assertTrue("Hint: checkIn() should return true when second copy " +
                   "checked back in. ",
                   library.checkIn(VIDEO1, SECOND_COPY));
        assertNull("Hint: checkIn() should set due date in item to null " +
                   "when second copy checked in. ", v.getDueDate());
        assertNull("Hint: checkIn() should set borrower in item to null " +
                   "when second copy checked in. ", v.getBorrower());
    }

    /**
     * Tests renewing a book.
     */
    public void testRenewAnItem()
    {
        // Test renewing a book
        Book b = new Book();
        b.setCallNumber(BOOK1);
        library.addItem(b);
        library.checkOut(BOOK1, FIRST_COPY, BORROWER,
                         DAY_1);
        GregorianCalendar due = b.getDueDate();
        GregorianCalendar expectedDue = (GregorianCalendar)due.clone();
        expectedDue.add(Calendar.DAY_OF_MONTH, 14);
        assertEquals("Hint: renew() should return a due date that is 14 days " +
                   "after the original due date. ", expectedDue,
                   library.renew(BOOK1, FIRST_COPY, BORROWER, due));
        assertEquals("Hint: renew() should set the new due date to 14 days " +
                   "after the original due date. ", expectedDue,
                   b.getDueDate());

        // Test that an overdue book cannot be renewed
        GregorianCalendar overdue = (GregorianCalendar)expectedDue.clone();
        overdue.add(Calendar.DAY_OF_MONTH, 5);
        assertNull("Hint: renew() should return null if the book is " +
                   "overdue. ",
                   library.renew(BOOK1, FIRST_COPY, BORROWER, overdue));
        assertEquals("Hint: renew() should not change the due date of a " +
                   "book that is overdue. ", expectedDue, b.getDueDate());

        // Test that a book with a different borrower cannot be renewed
        assertNull("Hint: renew() should return null if the book is " +
                   "not checked out to borrower. ",
                   library.renew(BOOK1, FIRST_COPY, BORROWER2, expectedDue));
        assertEquals("Hint: renew() should not change the due date of a " +
                   "book that is not checked out to borrower. ",
                   expectedDue, b.getDueDate());

        // Test that a different copy of the book cannot be renewed
        assertNull("Hint: renew() should return null if the copy number does " +
                   "not match the one checked out to borrower. ",
                   library.renew(BOOK1, SECOND_COPY, BORROWER, expectedDue));
        assertEquals("Hint: renew() should not change the due date of a " +
                   "copy of a book that is not checked out to borrower. ",
                   expectedDue, b.getDueDate());

        // Test that a book not in the library cannot be renewed
        assertNull("Hint: renew() should return null if the book does " +
                   "not exist in the library.",
                   library.renew(BOOK2, FIRST_COPY, BORROWER, expectedDue));

        // Test that an audio recording cannot be renewed
        AudioRecording a = new AudioRecording();
        a.setCallNumber(AUDIO1);
        library.addItem(a);
        library.checkOut(AUDIO1, FIRST_COPY, BORROWER,
                         DAY_1);
        due = a.getDueDate();
        assertNull("Hint: renew() should return null if the item being " +
                   "renewed is an audio recording. ",
                   library.renew(AUDIO1, FIRST_COPY, BORROWER, due));
        assertEquals("Hint: renew() should not change the due date if " +
                   "renewal is an audio recording. ", due,
                   a.getDueDate());

        // Test that a video recording cannot be renewed
        VideoRecording v = new VideoRecording();
        v.setCallNumber(VIDEO1);
        library.addItem(v);
        library.checkOut(VIDEO1, FIRST_COPY, BORROWER,
                         DAY_1);
        due = v.getDueDate();
        assertNull("Hint: renew() should return null if the item being " +
                   "renewed is a video recording. ",
                   library.renew(VIDEO1, FIRST_COPY, BORROWER, due));
        assertEquals("Hint: renew() should not change the due date if " +
                   "renewal is a video recording. ", due,
                   v.getDueDate());
    }

    /**
     * Tests renewing all books for a borrower.
     */
    public void testRenewAll()
    {
        // Test renewing a book
        Book b1 = new Book();
        b1.setCallNumber(BOOK1);
        library.addItem(b1);
        library.checkOut(BOOK1, FIRST_COPY, BORROWER,
                         DAY_1);
        GregorianCalendar due1 = (GregorianCalendar)b1.getDueDate().clone();

        AudioRecording a = new AudioRecording();
        a.setCallNumber(AUDIO1);
        library.addItem(a);
        library.checkOut(AUDIO1, FIRST_COPY, BORROWER,
                         DAY_1);
        GregorianCalendar audioDue = (GregorianCalendar)a.getDueDate().clone();

        Book b2 = new Book();
        b2.setCallNumber(BOOK2);
        library.addItem(b2);
        library.checkOut(BOOK2, FIRST_COPY, BORROWER,
                         DAY_1);
        GregorianCalendar due2 = (GregorianCalendar)b2.getDueDate().clone();

        VideoRecording v = new VideoRecording();
        v.setCallNumber(VIDEO1);
        library.addItem(v);
        library.checkOut(VIDEO1, FIRST_COPY, BORROWER,
                         DAY_1);
        GregorianCalendar videoDue = (GregorianCalendar)v.getDueDate().clone();

        Book b3 = new Book();
        b3.setCallNumber(BOOK3);
        library.addItem(b3);
        library.checkOut(BOOK3, FIRST_COPY, BORROWER2,
                         DAY_1);
        GregorianCalendar bookDue = (GregorianCalendar)b3.getDueDate().clone();

        MediaItem [] renewedItems = library.renew(BORROWER,
                                    DAY_15);
        assertEquals("Hint: renew() for a borrower returned an array " +
                     "with the wrong number of items", 2, renewedItems.length);
        assertEquals("Hint: renew() for a borrower returned array with " +
                     "incorrect contents. ",
                     b1, renewedItems[0]);
        assertEquals("Hint: renew() for a borrower returned array with " +
                     "incorrect contents. ",
                     b2, renewedItems[1]);
        
        due1.add(Calendar.DAY_OF_MONTH, 14);
        assertEquals("Hint: renew() for a borrower set the due date for " +
                     "a book incorrectly. ", due1, b1.getDueDate());
        due2.add(Calendar.DAY_OF_MONTH, 14);
        assertEquals("Hint: renew() for a borrower set the due date for " +
                     "a book incorrectly. ", due2, b2.getDueDate());
        assertEquals("Hint: renew() for a borrower changed the due date " +
                     "for an audio recording. ",
                     audioDue, a.getDueDate());
        assertEquals("Hint: renew() for a borrower changed the due date " +
                     "for an videoo recording. ",
                     videoDue, v.getDueDate());
        assertEquals("Hint: renew() for a borrower changed the due date " +
                     "for a book checked out to a different borrower. ",
                     bookDue, b3.getDueDate());


        // Test when there are no items for a borrower
        renewedItems = library.renew(BORROWER3,
                                     DAY_15);
        assertEquals("Hint: renew() for a borrower with no checked out items " +
                     "returned an array with the wrong number of items",
                     0, renewedItems.length);

        // Test when all items overdue
        renewedItems = library.renew(BORROWER,
                                     DAY_370);
        assertEquals("Hint: renew() for a borrower with overdue items " +
                     "returned an array with the wrong number of items",
                     0, renewedItems.length);
    }

    /**
     * Tests calculateDateDiff().
     */
    public void testDateDiff()
    {
        int diff = AnytownLibrary.calculateDateDiff(DAY_1, DAY_31);
        assertEquals("Wrong date diff", 30, diff);

        diff = AnytownLibrary.calculateDateDiff(DAY_1, DAY_32);
        assertEquals("Wrong date diff", 31, diff);
    }

    /**
     * Builds some media items to use in the library.
     *
     * @return three MediaItem objects
     */
    protected static MediaItem [] buildItems()
    {
        MediaItem [] items = new MediaItem[3];

        Book b = new Book();
        b.setCallNumber("123.45");
        b.setTitle("Enders Game");
        b.setAuthor("Orson Scott Card");
        items[0] = b;

        AudioRecording audio = new AudioRecording();
        audio.setCallNumber("234.56");
        audio.setTitle("The Shining");
        items[1] = audio;

        VideoRecording vid = new VideoRecording();
        vid.setCallNumber("567.89");
        vid.setTitle("The Shining");
        items[2] = vid;

        return items;
    }

    /**
     * Builds a library for read/write.
     *
     * @param items array  of MediaItem to build a new Library
     * @return the library
     */
    protected static AnytownLibrary buildLibrary(MediaItem [] items)
    {
        AnytownLibrary lib = new AnytownLibrary();

        for (MediaItem item : items)
        {
            lib.addItem(item);
        }

        return lib;
    }

    /** Test getItems(). */
    public void testGetItems()
    {
        MediaItem [] oldItems = buildItems();
        AnytownLibrary lib = buildLibrary(oldItems);
        MediaItem [] newItems = lib.getItems();

        assertEquals("Hint: getItems() returned array of wrong length",
            oldItems.length, newItems.length);

        for (int i = 0; i < oldItems.length; i++)
        {
            assertEquals("Hint: getItems() returned wrong items",
                oldItems[i].getCallNumber(), newItems[i].getCallNumber());
        }
    }

    /**
     * Test serialization and deserialization.
     */
    public void testWriteAndRead()
    {
        String fileName = "Library.dat";

        AnytownLibrary lib = buildLibrary(buildItems());
        AnytownLibrary duplicate = null;

        boolean passed = true;
        try
        {
            lib.writeToFile(fileName);
            duplicate = AnytownLibrary.readFromFile(fileName);
            passed = true;
        }
        catch (Exception e)
        {
        	//	Nothing here
        }
        assertTrue("Problem writing or reading file", passed);

        MediaItem [] oldItems = lib.getItems();
        MediaItem [] newItems = duplicate.getItems();
        assertEquals("Hint: After reading in library from a file, "
            + "the item count is incorrect.",
            oldItems.length,
            newItems.length);

        for (int i = 0; i < oldItems.length; i++)
        {
            assertEquals("Hint: After reading in library from a file, " +
                "some items have the wrong call number.",
                oldItems[i].getCallNumber(),
                newItems[i].getCallNumber());
            assertEquals("Hint: After reading in library from a file, " +
                "some items have the wrong copy number.",
                oldItems[i].getCopyNumber(),
                newItems[i].getCopyNumber());
        }

    }

    /**
     * Test trying to read from non-existent file.
     */
    public void testBadFileNameRead()
    {
    	boolean passed = false;
        try
        {
            AnytownLibrary.readFromFile("foofoo.dat");
        }
        catch (IOException e)
        {
            passed = true;
        }
        catch (ClassNotFoundException e)
        {
            //  Nothing here
        }
        assertTrue("Should have thrown IOException on bad file name", passed);
    }

    /*# TODO: insert Code here */
}

