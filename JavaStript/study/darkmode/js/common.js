// 출처
// https://velog.io/@yijaee/%EB%8B%A4%ED%81%AC%EB%AA%A8%EB%93%9C-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0
const $checkbox = document.querySelector('.check');

const isUserColorTheme = localStorage.getItem('color-theme');
const isOsColorTheme = window.matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light';
let p = document.querySelector('.p');

//localStorage에 값이 없을경우 isColorTheme 있으면 현재있는 테마사용
const getUserTheme = () => (isUserColorTheme ? isUserColorTheme : isOsColorTheme);

//처음 윈도우창을 띄었을 때
window.onload = function () {
  if (getUserTheme === 'dark') {
    localStorage.setItem('color-theme', 'dark');
    document.documentElement.setAttribute('color-theme', 'dark');
    $checkbox.setAttribute('checked', true);
  } else {
    localStorage.setItem('color-theme', 'light');
    document.documentElement.setAttribute('color-theme', 'light');
  }
};

//체크박스를 클릭했을때
$checkbox.addEventListener('click', e => {
  if (e.target.checked) {
    localStorage.setItem('color-theme', 'dark');
    document.documentElement.setAttribute('color-theme', 'dark');
    p.innerText = "라이트모드로변경";
    p.style.color = "white";
  } else {
    localStorage.setItem('color-theme', 'light');
    document.documentElement.setAttribute('color-theme', 'light');
    p.innerText = "다크모드로변경";
    p.style.color = "black";
  }
});