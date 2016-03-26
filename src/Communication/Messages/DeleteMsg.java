package Communication.Messages;

import Communication.Message;

public class DeleteMsg extends Message {

    public DeleteMsg(double _version, int _senderID, String _fileID) {
        super(MessageType.DELETE, _version, _senderID, _fileID);
    }

    public DeleteMsg(int _senderID, String _fileID) {
        this(1.0, _senderID, _fileID);
    }

    public String toString() {
        String result = new String();

        // TODO: Build string ready to deliver

        return result;
    }

}