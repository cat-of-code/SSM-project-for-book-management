package com.zhaochen.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Books  {
    private int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;

}
