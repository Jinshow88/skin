import './MainPage.css';

const MainPage = () => {
  return (
    <div className='Main'>
    <img src ="\image\nit.gif" alt='메인 이미지' className='main-image'></img>
      <div className='Search'>
        <h1 className='main-fin'>신나는 모험!! 멋진 친구들!!</h1>
          <button className="search-button">지역</button>
          <button className="search-button">체크인 - 체크아웃</button>
          <button className="search-button">인원</button>
          <button className="search-button search-bar"></button>
          <button className="search-button search-ba">검색</button>
      </div>
    </div>
  )
}

export default MainPage