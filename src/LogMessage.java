public class LogMessage {
    private String machineId;
    private String description;

    /** Precondition: message is a valid log message. */
    public LogMessage(String message)
    {
        int index = message.indexOf(":");
        machineId = message.substring(0, index);
        description = message.substring(index + 1);
    }

    /** Returns true if the description in this log message properly contains keyword;
     * false otherwise.
     */
    public boolean containsWord(String keyword)
    {
        int index = description.indexOf(keyword);
        while(index != -1)
        {
            int before = index - 1;
            int after = index + keyword.length();
            if ((before == -1 || description.substring(before, before + 1).equals(" ")) && (after == description.length() || description.substring(after, after + 1).equals(" ")))
            {
                    return true;
            }
        }
        return false;
    }

    public String getMachineId()
    { return machineId; }

    public String getDescription()
    { return description; }

    // There may be instance variables, constructors, and methods that are not shown.
}
