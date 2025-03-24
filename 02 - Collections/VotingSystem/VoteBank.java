package collections.VotingSystem;

import java.util.*;

public class VoteBank {
    private final HashMap<Candidate, List<Voter>> hashMap;
    private final LinkedHashMap<Candidate, List<Voter>> linkedHashMap;
    private final TreeMap<Candidate, List<Voter>> treeMap;

    public VoteBank() {
        this.hashMap = new HashMap<>();
        this.linkedHashMap = new LinkedHashMap<>();
        this.treeMap = new TreeMap<>(Comparator.comparing(Candidate::getName));
    }

    public HashMap<Candidate, List<Voter>> getHashMap() {
        return hashMap;
    }

    public LinkedHashMap<Candidate, List<Voter>> getLinkedHashMap() {
        return linkedHashMap;
    }

    public TreeMap<Candidate, List<Voter>> getTreeMap() {
        return treeMap;
    }

    public void addVote(Candidate candidate, Voter voter) {
        if (hashMap.containsKey(candidate)) {
            hashMap.get(candidate).add(voter);
            linkedHashMap.get(candidate).add(voter);
            treeMap.get(candidate).add(voter);
        } else{
            List<Voter> voters = new ArrayList<>();
            voters.add(voter);

            hashMap.put(candidate, new ArrayList<>(voters));
            linkedHashMap.put(candidate, new ArrayList<>(voters));
            treeMap.put(candidate, new ArrayList<>(voters));
        }
    }

    public void displayVotes(){
        for (Map.Entry<Candidate, List<Voter>> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}