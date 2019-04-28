import java.util.ArrayList;

public class ActionManager extends Actuatable {
    String name;
    ArrayList<Action> actions;
    ArrayList<ArrayList<Action>> groups;

    public ActionManager() {
        actions = new ArrayList<Action>();
        groups = new ArrayList<ArrayList<Action>>();
    }

    public void changeOrder(int index, int futureIndex, boolean overrideGroups) {
        boolean proceed = false;
        Action toMove = actions.get(index);
        for(ArrayList<Action> g: groups) {
            if(g.contains(toMove)) {
                if(!overrideGroups) {
                    getConsole().addMessage("Did not change the order of action " + toMove.getName() + " because it was in a group");
                } else {
                    proceed = true;
                }
            }
        }
        if(proceed) {
            actions.add(toMove);
            actions.remove(toMove);
            int endLocation = actions.indexOf(toMove);
            getConsole().addMessage("Moved action " + toMove.getName() + " from " + index+1 + " to " + endLocation);
        }
    }

    /**
    * Resets the groups to one to one
    */

    public void resetGroupsOneToOne() {
        int resetGroupsOneToOneIndex = 0;
        groups.clear();
        for (Action a : actions) {
            ArrayList<Action> newGroup = new ArrayList<Action>();
            newGroup.add(a);
            groups.add(resetGroupsOneToOneIndex, newGroup);
            resetGroupsOneToOneIndex++;
        }
        getConsole().addMessage("Groups reset to one to one");
    }

    /**
     * Adds actions to groups. Actions should always come from a source that
     */

    public void makeGroup(ArrayList<Action> actionsToAdd) {
        boolean completeMakeGroup = true;
        for(Action a : actionsToAdd){
            if(actions.indexOf(a) == -1) {
                completeMakeGroup = false;
            }
        }
        if(completeMakeGroup) {
            groups.add(actionsToAdd);
        }
        String namesOfActions = "";
        for(Action c : actionsToAdd) {
            namesOfActions = namesOfActions + c.getName();
        }
        getConsole().addMessage("Created group at " + groups.indexOf(actionsToAdd) + ". Comprised of " + namesOfActions + ".");
    }

}
