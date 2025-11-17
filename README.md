# Practical-3: GUNI – Intent Demonstration App

## AIM
Create an Android application that demonstrates the use of **Implicit Intent** and **Explicit Intent** with simple real-life examples.

---

## FEATURES IMPLEMENTED

### Implicit Intent Examples
- Make a call to a given phone number  
- Open a website in the browser  
- View Call Log  
- Open Gallery to view photos  
- Set an alarm  
- Open the Camera to capture an image  

### Explicit Intent
- Move from **MainActivity** to **LoginActivity**

---

## STUDY CONCEPTS USED
- Intent Types  
  - Implicit Intent  
  - Explicit Intent  
- Intent Methods  
  - `Intent.ACTION_VIEW`  
  - `Intent.ACTION_DIAL`  
  - `Intent.ACTION_CALL`  
  - `setData()` / `setType()`  
  - `startActivity()`  
- Activity Result  
  - `ActivityResultContracts`  
- Permissions  
  - `checkSelfPermission()`  
  - `requestPermissions()`  
- URI & MIME Types  
  - `Uri.parse()`  
  - `"image/*"`  
  - `"tel:"`

---

## UI COMPONENTS USED
- Button  
- EditText  
- TextView  
- ConstraintLayout  
- CoordinatorLayout  
- Custom drawable backgrounds  

---

## ANDROID MANIFEST
### Permissions
- CALL_PHONE  
- READ_CALL_LOG  
- SET_ALARM  
- CAMERA  

### Activities
- MainActivity  
- LoginActivity  

Intent filters added where needed for implicit actions.

---

## DESIGN OVERVIEW
- Simple and clean screen layout  
- Purple-style buttons  
- Two screens:  
  - **Main Screen** → Implicit intents  
  - **Login Screen** → Explicit intent  
- Proper margins, spacing, and alignment  
- Supports both Light and Dark Mode  

---

## SCREENSHOTS

### Main Screen
![Output](https://drive.google.com/uc?export=view&id=1za3q8Tp9Q2w01R4bWvrAFccYIXqpta4f)

### Login Screen
![Output](https://drive.google.com/uc?export=view&id=1EUvSFtO7I7m6n_ld5gRVB8YMjBabxTk_)

---
