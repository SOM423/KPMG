public class SortLinkedList {
	public static Node sortLL(Node head) {
		
        //Base case 
        if(head== null || head.next== null)
        {
            return head;
        }

        Node current = head;

        while(current != null)
        {
            Node currNext = current.next;

            while(currNext !=null)
            {
                if(current.data > currNext.data)
                {
                    int temp = current.data;
                    current.data = currNext.data;
                    currNext.data = temp;
                }

                currNext = currNext.next;
            }
            current = current.next;
        }
        return head;
	}
}
