class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pTriangle = new ArrayList<>();
        pTriangle.add(new ArrayList<>());
        pTriangle.get(0).add(1);
        for (int cRow = 1; cRow < numRows; cRow++) {
            pTriangle.add(new ArrayList<>());
            List<Integer> cRowList = pTriangle.get(cRow);
            List<Integer> pRowList = pTriangle.get(cRow - 1);
            cRowList.add(1);
            for (int j = 1; j < pRowList.size(); j++) {
                int sum = pRowList.get(j) + pRowList.get(j - 1);
                cRowList.add(sum);
            }
            cRowList.add(1);
        }
        return pTriangle;
    }
}