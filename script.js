const removeList = () => {
  var list = document.getElementById("results");

  var listItems = list.getElementsByTagName("li");

  for (var i = 0; i < listItems.length; i++) {
    listItems[i].remove();
  }
};

const displayList = (list) => {
  const commentList = document.getElementById("results");

  list.forEach(function (user) {
    const li = document.createElement("li");

    li.textContent = user.name;

    commentList.appendChild(li);
  });
};

document.getElementById("search-input").addEventListener("keyup", async (e) => {
  // Search comments
  // Use this API: https://jsonplaceholder.typicode.com/comments?postId=3
  // Display the results in the UI

  // Things to look out for
  // ---
  // Use es6

  const res = await fetch("http://localhost:8080/");

  const json = await res.json();

  removeList();

  const searchTextBox = document.getElementById("search-input");

  const searchValue = searchTextBox.value;

  const filteredJson = json.filter((comment) => comment.name === searchValue);
  
  if (filteredJson.length > 0) {
    displayList(filteredJson);
  } else {
    displayList(json);
  }
});
