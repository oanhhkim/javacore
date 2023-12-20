Tìm hiều về git.ignore

1. WHAT
- Gitignore là file có tên là .gitignore do Git quy định. Nhiệm vụ của nó là liệt kê những file mà mình không mong muốn cho vào git, Git sẽ bỏ qua những file được khai báo trong file .gitignore

2. HOW
- Git sẽ bỏ qua những file hoặc một tập các file được đặt trong file .gitignore ở trong thư mục root project khi người dùng commit và push lên repository.
- Khi add 1 file mới vào git, git sẽ kiểm tra danh sách những file sẽ bỏ qua trong file .gitignore và không add chúng vào git. Đó mới chỉ là điều kiện cần, điều kiện đủ là files không có trong git cache nữa thì git nó mới bỏ qua, chứ files mà nằm trong git cache thì .gitignore sẽ vô tác dụng.

Cách .gitignore hoạt động như sau:

 - Quy tắc đơn giản: *.log để bỏ qua tất cả các file có đuôi là .log, hoặc /build để bỏ qua toàn bộ thư mục build.

 - Dấu chú thích: sử dụng dấu # để thêm chú thích vào file .gitignore để giải thích mục đích của các quy tắc.

 - Ký tự đặc biệt: File .gitignore hỗ trợ sử dụng một số ký tự đặc biệt như * (ký tự đại diện cho bất kỳ chuỗi ký tự nào), ? (ký tự đại diện cho một ký tự bất kỳ), và / (để chỉ định thư mục). 
		Ví dụ, *.log sẽ bỏ qua tất cả các file có đuôi là .log.

 - Negation: sử dụng dấu ! để bỏ qua quy tắc ignore. 
		Ví dụ, !important.log sẽ không bỏ qua file important.log.

 - Các file .gitignore lồng nhau: có thể có nhiều file .gitignore trong cả dự án hoặc thư mục con, và chúng sẽ được Git áp dụng theo thứ tự từ trên xuống dưới.
3. WHEN

Nên sử dụng file .gitignore trong các trường hợp sau đây:

 - Files và Thư mục Tạm Thời:

	Khi tạo ra các file tạm thời trong quá trình phát triển, chẳng hạn như các file log, các file tạm thời được sinh ra trong quá trình build, hoặc các file cache.
	Ví dụ: *.log, build/, cache/
 - File và Thư mục Hệ Thống:

	Khi không muốn theo dõi các file và thư mục hệ thống tạo ra trong quá trình phát triển, chẳng hạn như thư mục .DS_Store trên macOS.	
	Ví dụ: .DS_Store, Thumbs.db
 - Dependencies và Modules:

	Khi sử dụng các hệ thống quản lý dependencies như npm, pip, Composer, bạn có thể muốn bỏ qua thư mục hoặc file chứa dependencies để giữ cho lịch sử commit sạch sẽ và tránh việc lưu trữ mã nguồn không cần thiết.
	Ví dụ: node_modules/, vendor/
 - Cấu hình và File Nhạy Cảm:

	Khi có các file chứa cấu hình hoặc thông tin nhạy cảm (như khóa API) và không muốn chúng được chia sẻ trong kho lưu trữ.
	Ví dụ: config.ini, secrets.json
 - Thư mục và File Tạo Ra Bởi Công Cụ Phát Triển:

	Khi các công cụ phát triển (IDE, text editor, etc.) tạo ra các file hoặc thư mục không mong muốn.
	Ví dụ: .idea/ (thư mục của IntelliJ IDEA), .vscode/ (thư mục của Visual Studio Code)
- Ngôn Ngữ Lập Trình Cụ Thể:

	Khi sử dụng ngôn ngữ lập trình cụ thể và có các file hoặc thư mục được sinh ra bởi ngôn ngữ đó.
	Ví dụ: *.class (Java bytecode), __pycache__/ (Python bytecode cache)
4. WHY
Sử dụng file .gitignore trong dự án Git mang lại nhiều lợi ích quan trọng:

 - Giữ Kho Lưu Trữ Sạch Sẽ:

	Ngăn chặn các file và thư mục không mong muốn từ việc được theo dõi bởi Git, giữ cho kho lưu trữ sạch sẽ và chỉ chứa những phần quan trọng của dự án.
- Tăng Tốc Quá Trình Commit và Clone:

	Khi kho lưu trữ không chứa các file không cần thiết, quá trình commit và clone trở nên nhanh hơn do không phải tải về và lưu trữ các file không quan trọng.
 - Bảo Vệ Thông Tin Nhạy Cảm:

	Ngăn chặn thông tin nhạy cảm, chẳng hạn như khóa API, thông tin đăng nhập, hoặc cấu hình quan trọng, từ việc lẻ ra ngoài qua lịch sử commit.
 - Tránh Xung Đột Dependencies:
	có thể bỏ qua các thư mục chứa dependencies hoặc modules khi sử dụng các hệ thống quản lý dependencies, giảm xung đột và kích thước của kho lưu trữ.
 - Dễ Quản Lý Dự Án:

	Giúp tạo ra môi trường làm việc sạch sẽ và dễ quản lý hơn, đặc biệt là khi làm việc teamwork 
 - Loại Bỏ File và Thư Mục Tạm Thời:

	Loại bỏ các file tạm thời và thư mục tạo ra trong quá trình phát triển, giữ cho lịch sử commit tập trung vào các thay đổi quan trọng.
 - Phòng Ngừa Xung Đột IDE và Công Cụ Phát Triển:

	Bạn có thể bỏ qua các file và thư mục tạo ra bởi các IDE hoặc công cụ phát triển để tránh xung đột giữa các môi trường phát triển.
 - Phù Hợp Cho Môi Trường Phát Triển Đa Nền Tảng:

	Giúp tạo ra một cấu hình chung cho dự án, phù hợp với nhiều môi trường phát triển khác nhau.
5. WHO
   
File .gitignore nên được sử dụng bởi mọi người làm việc với Git, đặc biệt là trong các dự án phát triển phần mềm. 
