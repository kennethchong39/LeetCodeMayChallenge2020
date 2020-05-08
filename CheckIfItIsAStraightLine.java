public boolean checkStraightLine(int[][] coordinates) {
  if(coordinates.length == 0 || coordinates[0].length != 2){
      return false;
  }
  if(coordinates.length == 2){
      return true;
  }

  int currentX = 0;
  int c = 0;
  int m = 0;
  //formulate equation y = mx + c;
  int dM = (coordinates[1][0] - coordinates[0][0]);
  if(dM == 0) {
      currentX = coordinates[0][0];
  } else {
      m = (coordinates[1][1] - coordinates[0][1]) / (coordinates[1][0] - coordinates[0][0]);
      c = coordinates[0][1] - (m * coordinates[0][0]);
  }

  for(int r = 2; r < coordinates.length; r++) {
      int x = coordinates[r][0];
      int y = coordinates[r][1];
      int potentialY;
      if(dM == 0) {
          if(x != currentX) {
              return false;
          }
      } else {
          potentialY  = m * x + c;

          if(potentialY != y) {
              return false;
          }
      }
  }

  return true;
}

/*
 * 1. Understanding how to get a straight line in a graph --> y = mx + c and y = x (if x is consistent)
 * 2. No point checking if is a staight line if there's no more than 2 coordinates.length and coordinates[0].length is more than 2.
 * 3. Find dM (denominatorM) if is 0, we can't divide which means x is consistent throughout the graph y = x; 
 *   3a. else we set c = y - mx; and and m = difference in y over difference in x.
 * 4. Loop through each coordinates to find out if y == to calculated y (potentialY) or y matches current x if dM is 0;
 *
 * Time Complexity: O(n);
 * Space Complexity: O(1);
 */
