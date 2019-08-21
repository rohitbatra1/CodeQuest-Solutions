

pEach = 0; //probability of each Door
pSum = 0; //running sum of previous door probabilities

for(i = 0; i < numRounds; i++)
{
  numDoors = numDoorsOG - i - i * open;
  pSum += pEach;
}

return pEach;
