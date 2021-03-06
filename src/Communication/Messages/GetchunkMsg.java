package Communication.Messages;

import Communication.Message;

public class GetchunkMsg extends Message {

    private int chunkN;

    public GetchunkMsg(double _version, int _senderID, String _fileID, int _chunkN) {
        super(MessageType.GETCHUNK, _version, _senderID, _fileID);
        this.chunkN = _chunkN;
    }

    public GetchunkMsg(int _senderID, String _fileID, int _chunkN) {
        this(1.0, _senderID, _fileID, _chunkN);
    }

    public String toString() {
        String result = new String();

        result = this.getMsgType().toString() + " "
                + this.getVersion() + " "
                + this.getSenderID() + " "
                + this.getFileID() + " "
                + this.chunkN + " "
                + "\r\n\r\n";

        return result;
    }

    @Override
    public byte[] getBytes() {
        byte[] header = this.toString().getBytes();
        return header;
    }
}