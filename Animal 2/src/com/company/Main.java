package com.company;
import java.sql.*;
import java.io.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

//Assignment6
interface StringFunction {
    String run(String string);

    private static void insert (Connection conn) throws SQLException {
        String sql = "INSERT INTO person(animal_type, animal_name, birth_date) VALUES(?,?,?)";
        try(PreparedStatement pstmt =conn.prepareStatement(sql)){
            pstmt.setString(1, "Alpaca");
            pstmt.setString(2, "Sophie");
            pstmt.setDate(3, Date.valueOf("1976-1-13"));
            pstmt.executeUpdate();
        }
    }
    private static void query (Connection conn) throws SQLException{
        String sql = "SELECT animal_id, animal_name, first_name,birth_date FROM Animals";
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                System.out.printf("%d\t%-10s\t%-10s\t%tD%n",
                        rs.getInt(1),rs.getString(2),
                        rs.getString(3), rs.getDate(4));
            }
        }
    }
    public static void main(String[] args) throws SQLException{
        String url ="jdbc:sqlite:C:/SQLite/GettingStarted.db";
        try(Connection conn = DriverManager.getConnection(url)){
            insert(conn);
            query(conn);
        }
    }
}
    public class Main implements Runnable {
        private int i;
        public static void main(String[] args) throws InterruptedException, IOException {
            class First implements Runnable {
                private int i;

                public First(int i) {
                    this.i = i;
                }

                public void run() {

                    System.out.println("i = " + i +
                            " Thread Name = " + Thread.currentThread().getName());
                }
            }
            class Second implements Runnable {
                public void run() {
                    for (int j = 0; j < 15; j++)
                        System.out.println("Number of the animal in the zoo = " + j);
                }
            }

        // demonstration of filename: hello.txt
            File str1 = new File("hello.txt");

            FileReader fr1 = new FileReader(str1);
            BufferedReader br = new BufferedReader(fr1);
            String line;
            System.out.println(
                    "The animal list: ");
            while ((line = br.readLine()) != null) {
                //process the line
                System.out.println(line.toCharArray());
            }
            br.close();
            fr1.close();

            // Create an ArrayList object
            String str[] = new String[] {"1:", "Alpaca", "2:", "Antelope", "3:", "Leopard"};
            List<String> list = Arrays.asList(str);
            System.out.println(list);
            Scanner myAnimalSelection = new Scanner(System.in);


                // Display message
                // Create an ArrayList object
                ArrayList<String> animal = new ArrayList<String>();
                Scanner myNewAnimal = new Scanner(System.in);

                System.out.println("Enter New Animal: ");
                String userNewAnimal = myNewAnimal.nextLine();
                System.out.println("Great! You enter a new animal " + userNewAnimal);
                animal.add(userNewAnimal);
                try{
                    File userNewAnimalAdd = new File ("filename.txt");
                    Scanner myReader = new Scanner(userNewAnimalAdd);
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }

                //Use a lamba expression in the ArrayList's forEach() method to print every item in the list:
                animal.forEach((n) -> {
                    System.out.println(n);
                });
            System.out.println();
            System.out.println("Please spell leopard: ");

            //Code Showing stream()
            String userInput = myAnimalSelection.nextLine();
            List<String> result = list.stream().filter(s -> s.startsWith("L")).
                    collect(Collectors.toList());
            System.out.println("Correct!: " + result);
            //reading file
            try {
                FileReader fr = new FileReader("helloInput.txt");
                FileWriter fw = new FileWriter("helloOutput.txt");
                String strFile = "";

                int i;
                while ((i = fr.read()) != -1) {
                    strFile += (char) i;
                }
                System.out.println(str);
                fw.write(strFile);
                fr.close();
                fw.close();

                // Display message
                System.out.println(
                        "File reading and writing both done");
            }
            // Catch block to handle the exception
            catch (
                    IOException e) {
            }
            // method which takes a lambda expression as a parameter:
            System.out.println();
            StringFunction exclaim = (s) -> s + "!";


            // Collections.synchronizedList

            List<String> list1 =
                    Collections.synchronizedList(new ArrayList<String>());

            list1.add("name");
            list1.add("sound");


            synchronized(list1)
            {
                // must be in synchronized block
                Iterator it = list1.iterator();

                while (it.hasNext())
                    System.out.println("Let learn more about " + it.next());
            }
            //tread
            //Illustrating anonymous runnable object
            Thread t1 = new Thread(new Runnable()   // Anonymous Runnable object
            {
                public void run() {
                    System.out.println("Thank for you");
                }
            }
            );
            Thread t2 = new Thread() {
                public void run() {
                    System.out.println("See you again.");
                }
            };
            printFormatted("Hello User", exclaim);
            t1.start();
            t2.start();

            System.out.println("");
        }

        public static void printFormatted(String string, StringFunction format) {
            String result = format.run(string);
            System.out.println(result);


            Animal alpaca = new Alpaca();
            Animal antelope = new Antelope();
            Animal leopard = new Leopard();

            // using Scanner Class
            Scanner myName = new Scanner(System.in);
            System.out.println("Enter you name to continue: ");
            String userName = myName.nextLine().trim();
            System.out.println("Welcome: " + userName + " " + "\n");

            //getter and setter
            Alpaca myObj = new Alpaca();
            // Set the value of the name variable to "Sophie"
            myObj.setName("Sophie");

            Antelope myObj1 = new Antelope();
            // Set the value of the name variable to "Sophie"
            myObj1.setName("Lily");

            Leopard myObj2 = new Leopard();
            // Set the value of the name variable to "Sophie"
            myObj2.setName("Thomas");
            Scanner myNumber = new Scanner(System.in);
            System.out.println("Enter the number: ");
            double num = myNumber.nextDouble();
            if (num == 1) {
                // Outputs "Sophie"
                //getter
                System.out.println(myObj.getName() + " the" + " " + alpaca);
                alpaca.animalSound();
            } else if (num == 2) {
                // Outputs "Lily"
                //getter
                System.out.println(myObj1.getName() + " the" + " " + antelope);
                antelope.animalSound();
            } else if (num == 3) {
                // Outputs "Thomas"
                //getter
                System.out.println(myObj2.getName() + " the" + " " + leopard);
                leopard.animalSound();
            } else
                System.out.println("There are some IOException");

        }

        @Override
        public void run() {

                System.out.println("i = " + i +
                        " Thread Name = " + Thread.currentThread().getName());
            }
        }









