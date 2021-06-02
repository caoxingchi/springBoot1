package site.xingchi.springboot1.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@author itcolors
 *@date  2021/6/1 4:41 下午
 *@version 1.0
 *@description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
}
