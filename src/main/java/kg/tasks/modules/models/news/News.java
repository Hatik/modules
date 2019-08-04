package kg.tasks.modules.models.news;

import kg.tasks.modules.interfaces.INews;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class News{
    private String title;
    private String description;
    private String link;
}
