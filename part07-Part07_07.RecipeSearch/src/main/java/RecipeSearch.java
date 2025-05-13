
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipes>recipes=new ArrayList<>();
        System.out.println("File to read: ");
        String file=scanner.nextLine();

        try(Scanner fileScanner=new Scanner(Paths.get(file))) {
            while(fileScanner.hasNextLine()){
                String name=fileScanner.nextLine();
                int time=Integer.parseInt(fileScanner.nextLine());
                ArrayList<String>ingredients=new ArrayList<>();
                while(fileScanner.hasNextLine()){
                    String line=fileScanner.nextLine();
                    if(line.trim().isEmpty())
                    break;
                    ingredients.add(line);
                }
                recipes.add(new Recipes(name, time, ingredients));

            }
            
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("Commands:\n" + //
                        "list - lists the recipes\n" + //
                        "stop - stops the program\n"+"find name - searches recipes by name\n"+"find cooking time - searches recipes by cooking time\n"+"find ingredient - searches recipes by ingredient");
                        while (true) { 
                            System.out.print("Enter command: ");   
                            String command = scanner.nextLine();
                        
                            if (command.equals("stop"))
                                break;
                        
                            if (command.equals("list")) {
                                for (Recipes r : recipes) {
                                    System.out.println(r);
                                }
                            }
                        
                            if (command.equals("find name")) {
                                System.out.print("Searched word: ");
                                String search = scanner.nextLine();
                                for (Recipes r : recipes) {
                                    if (r.getName().contains(search)) {
                                        System.out.println(r);
                                    }
                                }
                            }
                        
                            if (command.equals("find cooking time")) {
                                System.out.print("Max cooking time: ");
                                int maxtime = Integer.parseInt(scanner.nextLine());
                                for (Recipes r : recipes) {
                                    if (r.getTime() <= maxtime) {
                                        System.out.println(r);
                                    }
                                }
                            }
                            if(command.equals("find ingredient")){
                                System.out.print("Ingredient: ");
                                String comm=scanner.nextLine();
                                for(Recipes r:recipes){
                                    if(r.getIngredients().contains(comm)){
                                        System.out.println(r);
                                    }
                                }
                            }
                        }
                        
        

    }

}
