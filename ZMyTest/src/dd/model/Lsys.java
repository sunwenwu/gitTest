package dd.model;

public class Lsys {
    private String id;

    private String groupCode;

    private String groupName;

    private String description;

    private String readonly;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode == null ? null : groupCode.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getReadonly() {
        return readonly;
    }

    public void setReadonly(String readonly) {
        this.readonly = readonly == null ? null : readonly.trim();
    }

    @Override
    public String toString() {
        return "Lsys [id=" + id + ", groupCode=" + groupCode + ", groupName=" + groupName + ", description=" + description + ", readonly=" + readonly
                + "]";
    }
    
    
}