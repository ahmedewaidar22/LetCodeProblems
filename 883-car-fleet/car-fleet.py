class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
       cars= sorted(zip(position,speed),reverse=True)
       time_last=0
       fleets=0
       for pos, spe in cars:
            time=(target-pos)/spe
            if time >time_last:
                time_last=time
                fleets+=1
       return fleets
