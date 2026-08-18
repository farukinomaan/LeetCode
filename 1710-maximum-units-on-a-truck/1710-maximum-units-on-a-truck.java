class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a,b)->Integer.compare(b[1],a[1]));

        int maxUnits=0;

        for(int i=0;i<boxTypes.length;i++){
            int numBoxes= boxTypes[i][0];
            int unitsPerBox= boxTypes[i][1];

            if(truckSize >= numBoxes){
                maxUnits += numBoxes * unitsPerBox;
                truckSize -= numBoxes;

            }
            else{
                maxUnits += truckSize * unitsPerBox;
                break;
            }
        }

        return maxUnits;
        
    }
}