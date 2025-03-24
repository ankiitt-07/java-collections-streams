package collections.VotingSystem;

public class Main {
    public static void main(String[] args) {
        VoteBank bank = new VoteBank();

        Candidate c1 = new Candidate("John", 50);
        Candidate c2 = new Candidate("Jane", 30);
        Candidate c3 = new Candidate("Jack", 70);

        Voter vote1 = new Voter("Harry", 29);
        Voter vote2 = new Voter("Snow", 30);
        Voter vote3 = new Voter("Ice", 20);

        bank.addVote(c1, vote1);
        bank.addVote(c2, vote2);
        bank.addVote(c1, vote3);

        bank.displayVotes();
    }
}
