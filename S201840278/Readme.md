### 任务1

#### Part1

![](http://www.plantuml.com/plantuml/png/hLHHRzCm47xlhx3sb6XqVm21ngGo9g5rQhU2X7XmsoCrE7PaNu0nxRzZ-owkaoB40tcvytVdky_tsRdqA1tshPxjjFHUNFNRhOQrTGXEgBRJq891BnXvcedmpPN1Jv-5J8lpxrRjXRPoNp5SKrB2_G_PHLoe5oAQhnnSerEc4PsMHhmIPsT5AHzQLJK1dDO0teNCW3xFcEWrmAyZeIUF4jNkUO3n0EHHcMaurBiVCYfcD5xnUNqo9Jb02bMZZ35ThGmyTDNxO98_EdEOK2UTXtIWOWpbrE0dx7g48UmHkdHqC7qhhctlzgKseOyCeeLPf1BBsqMozn-MPD-j5eIyNJwioBdP4BA--KXsiLdSPcs5ExhDqTsIUsUzGcMDwDY9CB6gqcPIkY6phSSIK69K83bNZojflj6-u73oi9nS0xJaC9mL6HXL9zGuCUDDaSonV4rpW1XAO_40hc0KDc-axe6kOK30VP4xAER__rYTzgDh7thbHj5FazDW6ZpKOtdYFMFN5yIw7gk1i2PBGYdkpC7OlI8ymd_LWRU4ZcZVE2SVIyRvbFnK9yrVHZGdJQbDXEReQLReblkSp-TfJ3D-x3QiwR7EIDa0v8PvMqAfRjvvSV6QAXLYvn_Xdtz-m8-o_lSVsYMOVT_gtm00)

#### Part2

 ![](http://www.plantuml.com/plantuml/png/SoWkIImgAStDuKfCBialKb1uqT3uTCaMXSHYXPACLFVKrAhK8hZKnDKlkfOzNT4CadNFBorAuKhDAyaigLHuEMF-quxf8E6SpBnKcEYJ7GtFb_S-wvlqT5S_IAuulwWajGWc-xHjvjFMfKzdhW19bHTb8aazcxxqwNw8SVdfN5nWgnHqevKZKtDoyijZxS2sA5Wf08q66W6nd0jYEh8oX0-0QbysT3xhNedi92uka37Op8NA0ot79ljY_Uwd_TFGPQ5U0Cf3FCRba9gN0WnN0000)

#### Part3 

尝试从面向对象编程角度理解`example`的设计理念，具体阐述这样写的好处与可改进之处（越详细越好） 好处。

##### BubbleSorter与Sorter

BubbleSorter使用Sorter这个接口，Sorter的接口声明了所有其他类需要调用的方法，因此如果要增加排序方法，只需要新建类使用Sorter作为接口并单独实现Sorter的所有方法，方便后续扩展代码。

##### Geezer

采用Java设计模式中的单例模式，即某个类只能有一个实例，提供一个全局的访问点。

实例化的唯一一个Geezer负责调用sort，并设置输出格式

##### Linable

排队位置实现的接口，其他需要排序的元素也可以调用这个接口并实现其中方法

##### 改进之处

Position定义在Line类中，在Linable需要import Position类，事实上不只有Line需要定义Position，排队成其他形状时也需要有Position，所以可以让Line继承Shape，并将Position定义在Shape中，方便加入其他排队形状。

Gourd采用枚举类型不适用有多个Gourd实例

---

### 任务2，任务3

共用类图



![](http://www.plantuml.com/plantuml/png/nLLDRnCn4BtdLrZbiY4a1oIuLA2I2we4KcWA5yJ1sPriJBpsOiz2ggh_7N_CkjxkWYfKYHnYUzvuvhtns7jXaHli6Zah9RUMhRlTJi9M6mJ3HDDAQ42XPMIvdJ7tMmg5Nxyn7XQBdrfKJ6fU5MIUHwTWjxzuw-rCl61--4xW5erGDMibL-mDEplBGbcNgfX70xdLW1ldwQntnFDIMJ3uI9xd_v7efqwKnwVcIVR8z5y8a-57JsuOKUeu7WGv-qNB3GeKMltDTxeICwh5Ll4Zz9flBN8KvHrPyG1X4eCCGH_icl22P0uML4qRXbmmO8IAWSUGgHGAFhV5zi1RODR_3ohff3hf5eAQhBZveS09oWwXXor2wtMJx8zQEOkv1jwG-AJFLqvrZJkebwzU3w5yLuEJcAFMeCCZasm3rMKo5YzBi7R2cKo-s3IDzs6i96zaNpQ-av2rCZFtq_f-kiiSk3h6rKRRq5IifSdvB00v0nCxh8x3pWqKOdYEgEE4zAGEw5CKerpacEnrvanOkdC9w6l0bSP3wgL04F0Bbnt4ddSMC7jUGbQY9oGsIaX7z44eO712K5Ky7A2i7WZbbA1gFCGmuzAbG2av7MnIOMaINwl4QuG_E8OU7plc3SOTZzCa_mYD52p-A86s4_zdOR7gwVfRJLERyMmx7FEZPvRo9RW6B0YO9ZBqTnbHlpE6t-GKhu1N6r4-V1J34-jsb0xBFn4kvzNxTR7kzdimK5qsl0Oct3-HFCNXXd9Jz9vA7YExs-ca5yjbhDaiFhlQh-ERIbqVJBr_sXWTIIVjNQtUKgpyyV5M8ZMmFtS1Q9tVdFILdFum0Zr2yyT_b2z0LLqZVmC0)

任务二演示[【B限】Java 02 256-QuickSort-Line_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1Rf4y1w7xd?spm_id_from=333.999.0.0)

任务三演示[【B限】Java 02 256-QuickSort-Matrix_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1i64y187hV?spm_id_from=333.999.0.0)

