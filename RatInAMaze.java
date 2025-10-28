//code is to find the paths in which a mouse can move from starting to destination in a maze
import java.util.ArrayList;
public class RatInAMaze {
    public static ArrayList<String> findPath(int i, int j, int n, int[][]visited, int[][]maze, ArrayList<String> paths, String move){
        //base condition if the rat reaches the final point
        if (i == n-1 && j == n-1) {
            paths.add(move);
            return paths;
        }
    //Lexicographical move -> [D | L | R | U]

    //Moving Downward
    if (i + 1 <= (n-1) && visited[i+1][j] == 0 && maze[i + 1][j] == 1) {
        visited[i][j] = 1;
        findPath(i+1, j, n, visited, maze, paths, move + 'D');
        visited[i][j] = 0;
    }

    //Moving Leftward
    if ( j - 1 >= 0 && visited[i][j-1] == 0 && maze[i][j-1] == 1) {
           visited[i][j] = 1;
           findPath(i, j-1, n, visited, maze, paths, move + 'L');
           visited[i][j] = 0;  
    } 

    //Moving RightWard
    if (j+1 <= (n-1) && visited[i][j+1] == 0 && maze[i][j+1] == 1) {
        visited[i][j] = 1;
        findPath(i, j+1, n, visited, maze, paths, move + 'R');
        visited[i][j] = 0;
    }

    //Moving Upward
    if (i-1 >= 0 && visited[i-1][j] == 0 && maze[i-1][j] == 1) {
        visited[i][j] = 1;
        findPath(i-1, j, n, visited, maze, paths, move + 'U');
        visited[i][j] = 0;
    }
        return paths;
    }
    
    //main function
    public static void main(String[] args) {
        int[][]maze = {{1, 0, 0, 0}, {1, 1, 0, 1}, {1, 1, 0, 0}, {0, 1, 1, 1}};
        int i = 0;
        int j = 0;
        int n = maze.length;
        int[][]visited = new int[n][n];
        String move = "";
        ArrayList<String> paths = new ArrayList<>();
        ArrayList<String> result = findPath(i, j, n, visited, maze, paths, move);
        for (String string : result) {
              System.out.print(string + " ");
        }
    }
}
