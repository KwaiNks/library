public class LibraryRecordEntry {

   String itemType;
   String itemTitle;
   String itemStatus;
   String memberAssociatedWithItem;
    
    public LibraryRecordEntry(String itemType, String itemTitle, String itemStatus,  String memberAssociatedWithItem ) {
     this.itemType = itemType;
     this.itemTitle = itemTitle;
     this.itemStatus = itemStatus;
     this.memberAssociatedWithItem = memberAssociatedWithItem;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public String getMemberAssociatedWithItem() {
        return memberAssociatedWithItem;
    }

     public void setMemberAssociatedWithItem(String memberAssociatedWithItem) {
        this.memberAssociatedWithItem = memberAssociatedWithItem;
    }
    
}
