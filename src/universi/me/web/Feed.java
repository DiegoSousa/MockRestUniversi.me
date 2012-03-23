package universi.me.web;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Feed {

	public String id;
	public String news;

	public Feed(String id) {
		this.news = "Feed "+id;
		this.id = id;
	}
}
